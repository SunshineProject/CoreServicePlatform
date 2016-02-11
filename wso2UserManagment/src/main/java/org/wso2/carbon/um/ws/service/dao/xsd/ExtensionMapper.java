
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.wso2.carbon.um.ws.service.dao.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserStoreException".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.UserStoreException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Tenant".equals(typeName)){
                   
                            return  org.wso2.carbon.user.api.xsd.Tenant.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.service.ws.um.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.um.ws.service.dao.xsd.ClaimDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.ws.um.carbon.wso2.org".equals(namespaceURI) &&
                  "ArrayOfString".equals(typeName)){
                   
                            return  org.wso2.carbon.um.ws.service.ArrayOfString.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.service.ws.um.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PermissionDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.um.ws.service.dao.xsd.PermissionDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://tenant.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Tenant".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.tenant.xsd.Tenant.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RealmConfiguration".equals(typeName)){
                   
                            return  org.wso2.carbon.user.api.xsd.RealmConfiguration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserStoreException".equals(typeName)){
                   
                            return  org.wso2.carbon.user.api.xsd.UserStoreException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimValue".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.ClaimValue.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    