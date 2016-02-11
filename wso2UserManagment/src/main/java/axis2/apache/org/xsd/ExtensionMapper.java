
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package axis2.apache.org.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserAdminException".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.UserAdminException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserStoreInfo".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.UserStoreInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "FlaggedName".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.FlaggedName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserRealmInfo".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.UserRealmInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimValue".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.ClaimValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UIPermissionNode".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.UIPermissionNode.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    