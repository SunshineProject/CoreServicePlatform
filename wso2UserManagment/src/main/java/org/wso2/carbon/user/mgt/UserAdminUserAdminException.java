
/**
 * UserAdminUserAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package org.wso2.carbon.user.mgt;

public class UserAdminUserAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1433345567252L;
    
    private axis2.apache.org.xsd.UserAdminUserAdminException faultMessage;

    
        public UserAdminUserAdminException() {
            super("UserAdminUserAdminException");
        }

        public UserAdminUserAdminException(java.lang.String s) {
           super(s);
        }

        public UserAdminUserAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UserAdminUserAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.UserAdminUserAdminException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.UserAdminUserAdminException getFaultMessage(){
       return faultMessage;
    }
}
    