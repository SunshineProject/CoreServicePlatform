package it.sinergis.sunshine.sps;



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
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class PostParser {

	public static void main  (String[] args) throws IOException, ParserConfigurationException, SAXException{
		String content;
		//System.out.println(System.getProperty("java.version"));
		content = new String(Files.readAllBytes(Paths.get("testRequest/get.xml")));
		LinkedList<Attribute> l = procedures(content);
		//System.out.println(l.get(0).getValue());
		ArrayList<Attribute>l1=getAttributes(content);
		String s = uriCodespace("http://www.sunshineproject.eu/sps/procedure/ROV-102");
		
		System.out.println("value"+l1.get(0).getValue());
		
	}
	
	
	public static ArrayList<Attribute> getAttributes(String content){
		try {
			ArrayList<Attribute> attributes = new ArrayList<Attribute> ();

			attributes.add(operation(content));
			//System.out.println(procedures(content)+"");
			attributes.addAll(procedures(content));
			
			
			
			
			
			return attributes;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<Attribute> ();
	}
	
	public static Attribute operation(String xml) throws ParserConfigurationException, SAXException, IOException{
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
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("/*").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
	        NodeList ns = (NodeList) ogg;

			
			for (int i = 0 ; i <ns.getLength();i++){ 
				attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				"urn:ogc:def:ows:sunshine:operation",
	    				"string", 
	    				ns.item(i).getLocalName().toLowerCase());
				System.out.println(ns.item(i).getLocalName().toLowerCase());

				return attribute; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return null;
	}
	
	public static String operationString(String xml) throws ParserConfigurationException, SAXException, IOException{
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
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			Object ogg = xpath.compile("/*").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ogg);
			
	        NodeList ns = (NodeList) ogg;

			
			for (int i = 0 ; i <ns.getLength();i++){ 
			

				return ns.item(i).getLocalName().toLowerCase(); 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        return null;
	    }
		
		return null;
	}
	
	
	
	
	
	public static LinkedList<Attribute> procedures(String xml) throws ParserConfigurationException, SAXException, IOException{
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		//System.out.println(xml);
		LinkedList<Attribute> attributes = new LinkedList<Attribute>();

		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		
		Document someXML = documentBuilder.parse(new InputSource(new StringReader(xml)));
		getAtt (attributes,xpath,someXML, "procedure");
		getAtt (attributes,xpath,someXML, "Procedure");
		/*if (attributes.size()==0){
			return null;
		}*/
		
		
		return attributes;
	}
	
	private static String uriCodespace(String uri){
		int index = uri.indexOf("http://www.sunshineproject.eu/sps/procedure/");
		if (index != 0 ){
			return null;
		}
		String t =  uri.replace ("http://www.sunshineproject.eu/sps/procedure/", "");
		t= t.substring(0, 3);				
		return t;
	}
	
	
	private static void getAtt (LinkedList<Attribute> attributes,XPath xpath,Document someXML, String nome ){
		try{
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
			//NodeList ns = (NodeList) xpath.compile("//*[local-name() = 'GetFeature']").evaluate(source, XPathConstants.NODESET);
	        NodeList ns = (NodeList) xpath.compile("//*[local-name() = '"+nome+"']").evaluate(someXML, XPathConstants.NODESET);
			System.out.println(ns.getLength());
	        for (int i = 0 ; i <ns.getLength();i++){
				System.out.println(ns.item(i).getTextContent());
				String s = uriCodespace(ns.item(i).getTextContent().trim());
				//System.out.println(""s);
				if (s == null){
					//non conforme allo standard previsto 
					//TODO decide cosa fare (security exception?)
					//return null;
				}
				Attribute attribute = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				"urn:ogc:def:ows:sunshine:workspace",
	    				"string", 
	    				s);
				
				Attribute attribute1 = new Attribute(
	    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
	    				"urn:ogc:def:ows:sunshine:procedure",
	    				"string", 
	    				ns.item(i).getTextContent().trim());
				
				attributes.add(attribute);
				attributes.add(attribute1);
				
				//return attribute; 
		        }
		} catch (Exception e) {
	        e.printStackTrace();
	        //TODO lanciare qualche eccezione di sicurezza
	        //return null;
	    }
	}
	
	
	
	
}
