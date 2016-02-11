package it.sinergis.sunshine.myHandler;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.apache.poi.hwpf.model.Sttb;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.wso2.carbon.identity.entitlement.mediator.callback.EntitlementCallbackHandler;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;
import org.wso2.carbon.identity.entitlement.mediator.callback.UTEntitlementCallbackHandler;

public class GeneralCallBack extends  EntitlementCallbackHandler  { 
	//private static String prefix= "urn:ogc:def:";
	@Override
	public String getUserName(MessageContext synCtx) {
		String  user ="everyone";
			try{
				System.out.println("getUserName");
		org.apache.axis2.context.MessageContext msgContext;
		Axis2MessageContext axis2Msgcontext = null;
		axis2Msgcontext = (Axis2MessageContext) synCtx;
		msgContext = axis2Msgcontext.getAxis2MessageContext();
		
	
			 user ="everyone";
			System.out.println("provo a settare un utente vuoto");
			user= (String) msgContext.getProperty("username");
			System.out.println("riesco a settare un utente vuoto" + user);
			if (user == null){
				user = "everyone";
			}
		}catch(Exception e ){}
		return user;
	}
	
	public Attribute[] findOtherAttributes(MessageContext synCtx) {
		
		
		
		
		Iterator<String> s = synCtx.getPropertyKeySet().iterator();
		LinkedList<Attribute> atts = new LinkedList<Attribute>();
		while(s.hasNext()){
			
			String o = s.next();
			if (o.startsWith("uri.var.")){
				System.out.println("------------------------------------------");
				String tmp = o.substring("uri.var.".length());
				
				
				System.out.println(o.getClass().toString());
				System.out.println(o.toString());
				
				
				Attribute prova = new Attribute(
						"urn:oasis:names:tc:xacml:3.0:attribute-category:resource", 
						tmp,
						"string", 
						(String) synCtx.getProperty(o));
				
				System.out.println(synCtx.getProperty(o));
				atts.add(prova);
				
				
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			
		}
		Attribute[] attibututes = new Attribute[atts.size()];
		return atts.toArray(attibututes );
	}

	
	
	
}
