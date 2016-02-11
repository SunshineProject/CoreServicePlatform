package it.sinergis.sunshine.sps;

import java.util.ArrayList;

import org.apache.synapse.MessageContext;
import org.opensaml.xml.encryption.P;
import org.wso2.carbon.identity.entitlement.mediator.callback.UTEntitlementCallbackHandler;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;



public class SPSCallBack extends  UTEntitlementCallbackHandler { 

	public Attribute[] findOtherAttributes(MessageContext synCtx) {
		String tmp = "";
		int i = 0 ;
		Attribute myAttribute ;
		try{
			//synCtx.getProperty("myService");
			System.out.println("print status ^^^^");
			System.out.println(synCtx.getProperty("myService").toString());
			myAttribute = new Attribute(
    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
    				"urn:ogc:def:ows:sunshine:service",
    				"string", 
    				(String) synCtx.getProperty("myService").toString().toLowerCase()
    				);			
			i++;
		}catch(Exception e ){
			myAttribute = null;
			
		}
		try{
			tmp = synCtx.getEnvelope().getBody().getFirstOMChild().toString();
			String operantion = PostParser.operationString(tmp);
			synCtx.setProperty("myService", operantion );
		}catch(Exception e ){
			
			
		}
		
		
		
		ArrayList<Attribute> attributesPost ;
		try{
		tmp = synCtx.getEnvelope().getBody().getFirstOMChild().toString();
		attributesPost = PostParser.getAttributes(tmp);
		
		}catch(NullPointerException e ){
			attributesPost=new ArrayList<Attribute> ();
			return null;
		}
		
		
    	
    	int size  = i;
    	//controll dimensione array ritorno 
    	
    	if(attributesPost!= null){
    		size += attributesPost.size() ;
    	   	Attribute [] attributes = new Attribute[size];
    	   	if(i==1){
    	   		attributes[0]=myAttribute;
    	   	}
    	   	
	    	for (Attribute attribute:attributesPost){
	    		attributes[i]=attribute;
	    		//System.out.println(attribute.getValue()+"  " );
	    		i++;
	    	}
	    	
	    		
	    		    		    	
	    	return attributes;
    	}else {
    		//TODO capire se in caso di ecc(per esempio xlml non non validi o errori run time parsing cosa fare!!)
    		return null;
    	}
    	
   	}
	
	
	
}