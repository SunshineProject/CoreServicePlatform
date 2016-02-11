
/**
 * RemoteUserStoreManagerServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.wso2.carbon.um.ws.service;

public class RemoteUserStoreManagerServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1433837408681L;
    
    private org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException faultMessage;

    
        public RemoteUserStoreManagerServiceUserStoreExceptionException() {
            super("RemoteUserStoreManagerServiceUserStoreExceptionException");
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    