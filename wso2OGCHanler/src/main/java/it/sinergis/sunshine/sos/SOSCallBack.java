package it.sinergis.sunshine.sos;

import it.sinergis.sunshine.MalformedIdentifierException;
import it.sinergis.sunshine.XMLtoJSON;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.naming.directory.InvalidAttributesException;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.axiom.om.OMException;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.wso2.carbon.identity.entitlement.mediator.callback.UTEntitlementCallbackHandler;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;
import org.xml.sax.SAXException;

public class SOSCallBack extends  UTEntitlementCallbackHandler {
	public Attribute[] findOtherAttributes(MessageContext synCtx) throws Exception {
		String httpType=(String) synCtx.getProperty("HTTP_METHOD").toString().toLowerCase();
		String contentType=(String) synCtx.getProperty("ContentType");
		String myService=(String) synCtx.getProperty("myService").toString().toLowerCase();
		ArrayList<Attribute> ara = new ArrayList<Attribute>();		
		
		org.apache.axis2.context.MessageContext msgContext;
		
		Axis2MessageContext axis2Msgcontext = null;
		axis2Msgcontext = (Axis2MessageContext) synCtx;
		msgContext = axis2Msgcontext.getAxis2MessageContext();
		contentType = (String) msgContext.getProperty("ContentType");
				
		getContentType( httpType,  contentType,  myService,	 ara);
		
		// se kvp
		if (httpType.equals("get")){
			LinkedList<Attribute> attrsget = KPV.getAttributes(synCtx.getTo().getAddress());
			ara.addAll(attrsget);
		}else if (httpType.equals("post") && contentType != null){
			
			if(contentType.equals("application/json")){
				String json = XMLtoJSON.xmlToJSON(synCtx.getEnvelope().getBody().getFirstOMChild().toString());
				LinkedList<Attribute> attrs = JSONParserSOS.getAttribute(json);
				ara.addAll(attrs);
			}
			if(contentType.equals("application/xml")){
				//TODO attualmente non supportato
			}
			if(contentType.equals("application/soap+xml")){
				String s =synCtx.getEnvelope().getBody().toStringWithConsume();
				/*		
				
				Attribute a = new Attribute(
						"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
						"urn:ogc:def:ows:sunshine:contenuto",
						"string", 
						s);
				ara.add(a);
				*/
				//throw new Exception(s);
				ArrayList<Attribute> attrs = PostParser.getAttributes(s);
			    ara.addAll(attrs);
			}
			
			
		}
		
		
		// genero array di attributi
		Attribute[] att = new Attribute[ara.size()];
		for(int i = 0; i< ara.size() ; i ++ ){
			att[i]=ara.get(i);
		}
		return att;

		
	}


	public void getContentType(String httpType, String contentType, String myService,	ArrayList<Attribute> ara){
		if (httpType != null){
			Attribute attribute = new Attribute(
					"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
					"urn:ogc:def:ows:sunshine:rest",
					"string", 
					httpType);
			
			ara.add(attribute);
		}
		try{
		if (contentType != null){
			contentType=contentType.toString().toLowerCase();
			Attribute attribute = new Attribute(
					"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
					"urn:ogc:def:ows:sunshine:contentType",
					"string", 
					contentType);
			
			ara.add(attribute);
		}
		
		}catch(Exception e){
	
		}
		
	
		try{
		if (myService != null){
			Attribute myAttribute = new Attribute(
					"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
					"urn:ogc:def:ows:sunshine:service",
					"string", 
					myService
					);		
			
			ara.add(myAttribute);
		}
		}catch(Exception e){
			
		}
		
		
		
		
	}
	
	
	
}
