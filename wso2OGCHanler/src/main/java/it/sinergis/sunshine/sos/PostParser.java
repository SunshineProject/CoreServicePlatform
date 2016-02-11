package it.sinergis.sunshine.sos;
import it.sinergis.sunshine.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.opensaml.xml.encryption.P;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class PostParser {
	
	public static ArrayList<Attribute> getAttributes(String content) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		ArrayList<Attribute> al = new ArrayList<Attribute>();
		
		al.add(operation(content));
		al.addAll(version(content));
		al.addAll(procedure(content));
		al.addAll(observation(content));
		al.addAll(offering(content));
		al.addAll(featureOfInterest(content));
		al.addAll(featureOfInterestIdentifier(content));
		al.addAll(observationIdentifier(content));
		al.addAll(procedurelink(content));
		
		return al;		
	}

	
	public static void main  (String[] args) throws IOException, XPathFactoryConfigurationException, ParserConfigurationException, SAXException, XPathExpressionException{
		String content;
		System.out.println(System.getProperty("java.version"));
		//content = new String(Files.readAllBytes(Paths.get("testRequest/WFSgetFeature.xml")));
		content = new String(Files.readAllBytes(Paths.get("testSOS/getcapability.xml")));
		//content = new String(Files.readAllBytes(Paths.get("testRequest/WFSDelete.xml")));
		//content = new String(Files.readAllBytes(Paths.get("testRequest/WFSDescribeFeacture.xml")));
		
		//content = new String(Files.readAllBytes(Paths.get("testRequest/WCSGetCoverage.xml")));
		//content = new String(Files.readAllBytes(Paths.get("testRequest/WFSgetFeature.xml")));
		/*
		System.out.println("------------service----------------");
		service(content);
		System.out.println("--------------operantion--------------");
		operation(content);
		System.out.println("-----------------operation2-----------");
		operation2Level(content);
		System.out.println("-----------------resource-----------");
		resource(content);
		System.out.println("-------------resource-insert--------------");
		resourceFromInsert(content);
		System.out.println("------------typeResource----------------");
		resourceWFSDescribeFeacture(content);
		System.out.println("------------typeResourceCoverage----------------");
		resourceCoverage(content);
		*/
		//getAttributes(content);	
		
		/*
		version(content);
		procedure(content);
		observation(content);
		offering(content);
		featureOfInterest(content);
		featureOfInterestIdentifier(content);
		observationIdentifier(content);*/
		//procedurelink(content);
		operation(content);
	}
	
	
	
	
	
	
	
	public static Attribute service(String xml) throws ParserConfigurationException, SAXException, IOException, XPathFactoryConfigurationException{
		XPathFactory xpathFactory = XPathFactory.newInstance();

		System.out.println(xpathFactory.toString());
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));

		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
	        NodeList ns = (NodeList) xpath.compile("/*").evaluate(someXML, XPathConstants.NODESET);

			
			for (int i = 0 ; i <ns.getLength();i++){
				Node serviceNode=ns.item(i).getAttributes().getNamedItem("service");
				System.out.println(serviceNode.getNodeValue());
				
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.SERVICE,
	    				"string", 
	    				serviceNode.getNodeValue().trim().toLowerCase());
				return attribute; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return null;
	}
	/*
	 * ritorna il tipo di azione da fare 
	 * fare dei controlli aggiuntivi se si vuole abilitare il wps per il recupero delle informazioni da controllare in seguito
	 * per esempio la possibilita di effettuare delle richieste wf all' interno di un wps potrebbe essere a causa di problemi e di pertita di informazioni sucessive 
	 * TODO
	 */
	public static Attribute operation(String xml) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
	
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(//*[local-name() = 'Body'])/*").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			System.out.println("edfere");
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.OPERATION,
	    				"string", 
	    				ns.item(i).getLocalName().toLowerCase());
				System.out.println(ns.item(i).getLocalName().toLowerCase());

				return attribute; 
		        }
		
		
		return null;
	}
						
	public static LinkedList<Attribute> version(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
	        NodeList ns = (NodeList) xpath.compile("(/*[local-name() = 'Body'])/*/@version").evaluate(someXML, XPathConstants.NODESET);
			
			for (int i = 0 ; i <ns.getLength();i++){
				System.out.println(ns.item(i).getNodeValue().trim());
				Attribute attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.VERSION,
	    				"string", 
	    				ns.item(i).getNodeValue().trim());
				attributes.add(attribute);
				//return attribute; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}
	
	public static LinkedList<Attribute>  procedure(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'procedure'])/text()").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String s = ns.item(i).getTextContent().toLowerCase().trim();
				if (s.length()<3){
					continue;
				}
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEPROCEDURE);
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
				System.out.println(ns.item(i).getTextContent().toLowerCase());

				attributes.add(attribute) ; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}

	public static LinkedList<Attribute>  observation(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'observation'])/text()").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){
				String s = ns.item(i).getTextContent().toLowerCase().trim();
				if (s.length()<3){
					continue;
				}
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEOBSERVATION);
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    			ws);
				System.out.println(ns.item(i).getTextContent().toLowerCase());

				attributes.add(attribute) ;
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}

	public static LinkedList<Attribute>  offering(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'offering'])/text()").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String s = ns.item(i).getTextContent().toLowerCase().trim();
				if (s.length()<3){
					continue;
				}
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEOFFERING);
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
				System.out.println(ns.item(i).getTextContent().toLowerCase());

				attributes.add(attribute) ;
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}

	public static LinkedList<Attribute>  featureOfInterest(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'featureOfInterest'])/text()").evaluate(someXML, XPathConstants.NODESET);
									
	        NodeList ns = (NodeList) ogg;
	        System.out.println(ns.toString());
	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String s = ns.item(i).getTextContent().toLowerCase().trim();
				if (s.length()<3){
					continue;
				}
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEFOI);
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
				System.out.println(ns.item(i).toString());

				attributes.add(attribute) ;
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}

	
	public static LinkedList<Attribute>  procedurelink(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'procedure'])/@*[local-name() = 'href']").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String s = ns.item(i).getNodeValue().toLowerCase().trim();
				if (s.length()<3){
					continue;
				}
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getNodeValue(), ParserIdentifier.TYPEPROCEDURE);
				
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
				System.out.println(ns.item(i).getNodeValue().toLowerCase());

				attributes.add(attribute) ; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}
	
	public static LinkedList<Attribute>  featureOfInterestIdentifier(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'featureOfInterest']//*[local-name() = 'identifier'])/text()").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEFOI);
				
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
				
				System.out.println(ns.item(i).getTextContent() .toLowerCase());//getTextContent()
				System.out.println(ns.item(i).toString() .toLowerCase());//getTextContent()

				attributes.add(attribute) ;
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}

	public static LinkedList<Attribute>  observationIdentifier(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();
		InputSource source = new InputSource(new StringReader(xml));
		String status = "";
		Attribute attribute = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("(/*[local-name() = 'Body']//*[local-name() = 'observation']/*[local-name() = 'OM_Observation']/*[local-name() = 'identifier'])/text()").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
			
	        NodeList ns = (NodeList) ogg;

	        System.out.println(ns.getLength());
			for (int i = 0 ; i <ns.getLength();i++){ 
				String ws = ParserIdentifier.getWorkspace(ns.item(i).getTextContent(), ParserIdentifier.TYPEOBSERVATION);

				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				Constant.WORKSPACE,
	    				"string", 
	    				ws);
							
				System.out.println(ns.item(i).getTextContent() .toLowerCase());//getTextContent()
				System.out.println(ns.item(i).toString() .toLowerCase());//getTextContent()

				attributes.add(attribute) ;
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return attributes;
	}
}
