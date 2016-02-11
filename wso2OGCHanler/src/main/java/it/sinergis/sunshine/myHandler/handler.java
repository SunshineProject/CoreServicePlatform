package it.sinergis.sunshine.myHandler;


import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.codec.binary.Base64;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.core.axis2.Axis2Sender;
import org.apache.synapse.rest.Handler;
 
  

import java.util.Map;
 
  
public class handler implements Handler {
    public void addProperty(String s, Object o) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
 
  
    public Map getProperties() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
 
    
    public boolean handleRequest(MessageContext messageContext) {
 
  
        org.apache.axis2.context.MessageContext axis2MessageContext
                = ((Axis2MessageContext) messageContext).getAxis2MessageContext();
        Object headers = axis2MessageContext.getProperty(
                org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);
 
  
  
        if (headers != null && headers instanceof Map) {
            Map headersMap = (Map) headers;
            if (headersMap.get("Authorization") == null) {
                headersMap.clear();
                axis2MessageContext.setProperty("HTTP_SC", "401");
                headersMap.put("WWW-Authenticate", "Basic realm=\"WSO2 ESB\"");
                axis2MessageContext.setProperty("NO_ENTITY_BODY", new Boolean("true"));
                messageContext.setProperty("RESPONSE", "true");
                messageContext.setTo(null);
                Axis2Sender.sendBack(messageContext);
                return false;
 
  
            } else {
                String authHeader = (String) headersMap.get("Authorization");
                String credentials = authHeader.substring(6).trim();
                if (processSecurity(credentials, messageContext)) {
                    return true;
                } else {
                    headersMap.clear();
                    axis2MessageContext.setProperty("HTTP_SC", "403");
                    axis2MessageContext.setProperty("NO_ENTITY_BODY", new Boolean("true"));
                    messageContext.setProperty("RESPONSE", "true");
                    messageContext.setTo(null);
                    Axis2Sender.sendBack(messageContext);
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public boolean handleRequest_old(MessageContext messageContext) {
    	 System.out.println("Entro nel handler");
    	 
    	  
        org.apache.axis2.context.MessageContext axis2MessageContext
                = ((Axis2MessageContext) messageContext).getAxis2MessageContext();
        Object headers = axis2MessageContext.getProperty(
                org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);
 
  
  
        if (headers != null && headers instanceof Map) {
            Map headersMap = (Map) headers;
            
            if (headersMap.get("Authorization") == null) {
            	 System.out.println("TRUE1");//non ho fornito nessun tipo di autenticazione 
                return true;
 
  
            } else {
                String authHeader = (String) headersMap.get("Authorization");
                String credentials = authHeader.substring(6).trim();
                if (processSecurity(credentials, messageContext)) {
                	System.out.println("TRUE2");
                	return true;
                } else {
                    headersMap.clear();
                    axis2MessageContext.setProperty("HTTP_SC", "403");
                    axis2MessageContext.setProperty("NO_ENTITY_BODY", new Boolean("true"));
                    messageContext.setProperty("RESPONSE", "true");
                    messageContext.setTo(null);
                    Axis2Sender.sendBack(messageContext);
                    System.out.println("FALSE");
                    return false;
                }
            }
        }
        System.out.println("TRU0E3");
        return true;
    }
 
  
    public boolean handleResponse(MessageContext messageContext) {
        return true;
    }
 
  
    public boolean processSecurity(String credentials,MessageContext messageContext) {
        String decodedCredentials = new String(new Base64().decode(credentials.getBytes()));
        String userName = decodedCredentials.split(":")[0];
        String password = decodedCredentials.split(":")[1];
        Axis2MessageContext axis2Msgcontext = null;
        org.apache.axis2.context.MessageContext msgContext;
        axis2Msgcontext = (Axis2MessageContext) messageContext;
        msgContext = axis2Msgcontext.getAxis2MessageContext();
        msgContext.setProperty("username", userName);
       
        return true;
        
        
        /*if ("admin".equals(userName) && "admin".equals(password)) {
            return true;
        } else {
            return false;
        }*/
        
        
        
    }
}