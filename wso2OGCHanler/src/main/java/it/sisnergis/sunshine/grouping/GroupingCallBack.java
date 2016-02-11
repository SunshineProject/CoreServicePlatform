package it.sisnergis.sunshine.grouping;

import java.util.ArrayList;

import org.apache.synapse.MessageContext;
import org.wso2.carbon.identity.entitlement.mediator.callback.UTEntitlementCallbackHandler;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;

public class GroupingCallBack  extends  UTEntitlementCallbackHandler {
	public Attribute[] findOtherAttributes(MessageContext synCtx) {
		String to = synCtx.getTo().getAddress();
		
		ArrayList<Attribute> ara = new ArrayList<Attribute>();		
		System.out.println("Si vede quello che stampo ");										
		String codespace = (String)getWorkspace(to);
		if (codespace != null){
			Attribute attribute = new Attribute(
					"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
					"urn:ogc:def:ows:sunshine:workspace",
					"string", 
					codespace);
			
			ara.add(attribute);
		}
		
		
		//return null;
		
	
		
		try{
			//synCtx.getProperty("myService");
			System.out.println("print status ^^^^");
			System.out.println(synCtx.getProperty("myService").toString());
			Attribute myAttribute = new Attribute(
    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
    				"urn:ogc:def:ows:sunshine:service",
    				"string", 
    				(String) synCtx.getProperty("myService").toString().toLowerCase()
    				);				
			ara.add(myAttribute);
		}catch(Exception e ){
		
		}
		try{
			//synCtx.getProperty("myService");
			System.out.println("print status ^^^^");
			System.out.println(synCtx.getProperty("HTTP_METHOD").toString());
			Attribute myAttribute = new Attribute(
    				"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
    				"urn:ogc:def:ows:sunshine:rest",
    				"string", 
    				(String) synCtx.getProperty("HTTP_METHOD").toString().toLowerCase()
    				);				
			ara.add(myAttribute);
		}catch(Exception e ){
		
		}
		//HTTP_METHOD
		
		
		
		
		
					
		Attribute[] att = new Attribute[ara.size()];
		for(int i = 0; i< ara.size() ; i ++ ){
			att[i]=ara.get(i);
		}
		return att;
		
		
		
	}
	
	public static void main (String args []){
		String stringa = "service/.../css/ROV/";
		System.out.println(getWorkspace(stringa));
		
		
		
		
	}
	public static String getWorkspace(String s ){
		int i = s.indexOf("/css/");
		if (i<0){
			return null;
		}
		int l = "/css/".length();
		if (i+l+3> s.length()){
			return null;

		}
		String ws = s.substring(  i+l,i+l+3);
		return ws;
	}
	
	
	
	
	
	
	
	
	
	
}
