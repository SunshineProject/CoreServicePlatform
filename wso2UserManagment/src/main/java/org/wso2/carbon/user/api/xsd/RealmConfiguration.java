
/**
 * RealmConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package org.wso2.carbon.user.api.xsd;
            

            /**
            *  RealmConfiguration bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RealmConfiguration
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RealmConfiguration
                Namespace URI = http://api.user.carbon.wso2.org/xsd
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for AddAdmin
                        */

                        
                                    protected java.lang.String localAddAdmin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddAdminTracker = false ;

                           public boolean isAddAdminSpecified(){
                               return localAddAdminTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAddAdmin(){
                               return localAddAdmin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddAdmin
                               */
                               public void setAddAdmin(java.lang.String param){
                            localAddAdminTracker = true;
                                   
                                            this.localAddAdmin=param;
                                    

                               }
                            

                        /**
                        * field for AdminPassword
                        */

                        
                                    protected java.lang.String localAdminPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdminPasswordTracker = false ;

                           public boolean isAdminPasswordSpecified(){
                               return localAdminPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdminPassword(){
                               return localAdminPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminPassword
                               */
                               public void setAdminPassword(java.lang.String param){
                            localAdminPasswordTracker = true;
                                   
                                            this.localAdminPassword=param;
                                    

                               }
                            

                        /**
                        * field for AdminRoleName
                        */

                        
                                    protected java.lang.String localAdminRoleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdminRoleNameTracker = false ;

                           public boolean isAdminRoleNameSpecified(){
                               return localAdminRoleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdminRoleName(){
                               return localAdminRoleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminRoleName
                               */
                               public void setAdminRoleName(java.lang.String param){
                            localAdminRoleNameTracker = true;
                                   
                                            this.localAdminRoleName=param;
                                    

                               }
                            

                        /**
                        * field for AdminUserName
                        */

                        
                                    protected java.lang.String localAdminUserName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdminUserNameTracker = false ;

                           public boolean isAdminUserNameSpecified(){
                               return localAdminUserNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdminUserName(){
                               return localAdminUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminUserName
                               */
                               public void setAdminUserName(java.lang.String param){
                            localAdminUserNameTracker = true;
                                   
                                            this.localAdminUserName=param;
                                    

                               }
                            

                        /**
                        * field for AuthorizationManagerClass
                        */

                        
                                    protected java.lang.String localAuthorizationManagerClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthorizationManagerClassTracker = false ;

                           public boolean isAuthorizationManagerClassSpecified(){
                               return localAuthorizationManagerClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAuthorizationManagerClass(){
                               return localAuthorizationManagerClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthorizationManagerClass
                               */
                               public void setAuthorizationManagerClass(java.lang.String param){
                            localAuthorizationManagerClassTracker = true;
                                   
                                            this.localAuthorizationManagerClass=param;
                                    

                               }
                            

                        /**
                        * field for AuthzProperties
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localAuthzProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthzPropertiesTracker = false ;

                           public boolean isAuthzPropertiesSpecified(){
                               return localAuthzPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getAuthzProperties(){
                               return localAuthzProperties;
                           }

                           
                        


                               
                              /**
                               * validate the array for AuthzProperties
                               */
                              protected void validateAuthzProperties(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AuthzProperties
                              */
                              public void setAuthzProperties(java.lang.String[] param){
                              
                                   validateAuthzProperties(param);

                               localAuthzPropertiesTracker = true;
                                      
                                      this.localAuthzProperties=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addAuthzProperties(java.lang.String param){
                                   if (localAuthzProperties == null){
                                   localAuthzProperties = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localAuthzPropertiesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAuthzProperties);
                               list.add(param);
                               this.localAuthzProperties =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = true;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for EveryOneRoleName
                        */

                        
                                    protected java.lang.String localEveryOneRoleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEveryOneRoleNameTracker = false ;

                           public boolean isEveryOneRoleNameSpecified(){
                               return localEveryOneRoleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEveryOneRoleName(){
                               return localEveryOneRoleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EveryOneRoleName
                               */
                               public void setEveryOneRoleName(java.lang.String param){
                            localEveryOneRoleNameTracker = true;
                                   
                                            this.localEveryOneRoleName=param;
                                    

                               }
                            

                        /**
                        * field for MultipleCredentialProps
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localMultipleCredentialProps ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMultipleCredentialPropsTracker = false ;

                           public boolean isMultipleCredentialPropsSpecified(){
                               return localMultipleCredentialPropsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getMultipleCredentialProps(){
                               return localMultipleCredentialProps;
                           }

                           
                        


                               
                              /**
                               * validate the array for MultipleCredentialProps
                               */
                              protected void validateMultipleCredentialProps(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MultipleCredentialProps
                              */
                              public void setMultipleCredentialProps(java.lang.String[] param){
                              
                                   validateMultipleCredentialProps(param);

                               localMultipleCredentialPropsTracker = true;
                                      
                                      this.localMultipleCredentialProps=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addMultipleCredentialProps(java.lang.String param){
                                   if (localMultipleCredentialProps == null){
                                   localMultipleCredentialProps = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localMultipleCredentialPropsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMultipleCredentialProps);
                               list.add(param);
                               this.localMultipleCredentialProps =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for PasswordsExternallyManaged
                        */

                        
                                    protected boolean localPasswordsExternallyManaged ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordsExternallyManagedTracker = false ;

                           public boolean isPasswordsExternallyManagedSpecified(){
                               return localPasswordsExternallyManagedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPasswordsExternallyManaged(){
                               return localPasswordsExternallyManaged;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordsExternallyManaged
                               */
                               public void setPasswordsExternallyManaged(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPasswordsExternallyManagedTracker =
                                       true;
                                   
                                            this.localPasswordsExternallyManaged=param;
                                    

                               }
                            

                        /**
                        * field for PersistedTimestamp
                        */

                        
                                    protected java.util.Date localPersistedTimestamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersistedTimestampTracker = false ;

                           public boolean isPersistedTimestampSpecified(){
                               return localPersistedTimestampTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPersistedTimestamp(){
                               return localPersistedTimestamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersistedTimestamp
                               */
                               public void setPersistedTimestamp(java.util.Date param){
                            localPersistedTimestampTracker = true;
                                   
                                            this.localPersistedTimestamp=param;
                                    

                               }
                            

                        /**
                        * field for Primary
                        */

                        
                                    protected boolean localPrimary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryTracker = false ;

                           public boolean isPrimarySpecified(){
                               return localPrimaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPrimary(){
                               return localPrimary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primary
                               */
                               public void setPrimary(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPrimaryTracker =
                                       true;
                                   
                                            this.localPrimary=param;
                                    

                               }
                            

                        /**
                        * field for RealmClassName
                        */

                        
                                    protected java.lang.String localRealmClassName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealmClassNameTracker = false ;

                           public boolean isRealmClassNameSpecified(){
                               return localRealmClassNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRealmClassName(){
                               return localRealmClassName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealmClassName
                               */
                               public void setRealmClassName(java.lang.String param){
                            localRealmClassNameTracker = true;
                                   
                                            this.localRealmClassName=param;
                                    

                               }
                            

                        /**
                        * field for RealmProperties
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRealmProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealmPropertiesTracker = false ;

                           public boolean isRealmPropertiesSpecified(){
                               return localRealmPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRealmProperties(){
                               return localRealmProperties;
                           }

                           
                        


                               
                              /**
                               * validate the array for RealmProperties
                               */
                              protected void validateRealmProperties(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RealmProperties
                              */
                              public void setRealmProperties(java.lang.String[] param){
                              
                                   validateRealmProperties(param);

                               localRealmPropertiesTracker = true;
                                      
                                      this.localRealmProperties=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRealmProperties(java.lang.String param){
                                   if (localRealmProperties == null){
                                   localRealmProperties = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRealmPropertiesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRealmProperties);
                               list.add(param);
                               this.localRealmProperties =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for SecondaryRealmConfig
                        */

                        
                                    protected org.wso2.carbon.user.api.xsd.RealmConfiguration localSecondaryRealmConfig ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryRealmConfigTracker = false ;

                           public boolean isSecondaryRealmConfigSpecified(){
                               return localSecondaryRealmConfigTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.api.xsd.RealmConfiguration
                           */
                           public  org.wso2.carbon.user.api.xsd.RealmConfiguration getSecondaryRealmConfig(){
                               return localSecondaryRealmConfig;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryRealmConfig
                               */
                               public void setSecondaryRealmConfig(org.wso2.carbon.user.api.xsd.RealmConfiguration param){
                            localSecondaryRealmConfigTracker = true;
                                   
                                            this.localSecondaryRealmConfig=param;
                                    

                               }
                            

                        /**
                        * field for TenantId
                        */

                        
                                    protected int localTenantId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTenantIdTracker = false ;

                           public boolean isTenantIdSpecified(){
                               return localTenantIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTenantId(){
                               return localTenantId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TenantId
                               */
                               public void setTenantId(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTenantIdTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTenantId=param;
                                    

                               }
                            

                        /**
                        * field for UserStoreClass
                        */

                        
                                    protected java.lang.String localUserStoreClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserStoreClassTracker = false ;

                           public boolean isUserStoreClassSpecified(){
                               return localUserStoreClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserStoreClass(){
                               return localUserStoreClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserStoreClass
                               */
                               public void setUserStoreClass(java.lang.String param){
                            localUserStoreClassTracker = true;
                                   
                                            this.localUserStoreClass=param;
                                    

                               }
                            

                        /**
                        * field for UserStoreProperties
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localUserStoreProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserStorePropertiesTracker = false ;

                           public boolean isUserStorePropertiesSpecified(){
                               return localUserStorePropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getUserStoreProperties(){
                               return localUserStoreProperties;
                           }

                           
                        


                               
                              /**
                               * validate the array for UserStoreProperties
                               */
                              protected void validateUserStoreProperties(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param UserStoreProperties
                              */
                              public void setUserStoreProperties(java.lang.String[] param){
                              
                                   validateUserStoreProperties(param);

                               localUserStorePropertiesTracker = true;
                                      
                                      this.localUserStoreProperties=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addUserStoreProperties(java.lang.String param){
                                   if (localUserStoreProperties == null){
                                   localUserStoreProperties = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localUserStorePropertiesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localUserStoreProperties);
                               list.add(param);
                               this.localUserStoreProperties =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.user.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RealmConfiguration",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RealmConfiguration",
                           xmlWriter);
                   }

               
                   }
                if (localAddAdminTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "addAdmin", xmlWriter);
                             

                                          if (localAddAdmin==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAddAdmin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdminPasswordTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "adminPassword", xmlWriter);
                             

                                          if (localAdminPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdminPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdminRoleNameTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "adminRoleName", xmlWriter);
                             

                                          if (localAdminRoleName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdminRoleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdminUserNameTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "adminUserName", xmlWriter);
                             

                                          if (localAdminUserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdminUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuthorizationManagerClassTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "authorizationManagerClass", xmlWriter);
                             

                                          if (localAuthorizationManagerClass==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAuthorizationManagerClass);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuthzPropertiesTracker){
                             if (localAuthzProperties!=null) {
                                   namespace = "http://api.user.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localAuthzProperties.length;i++){
                                        
                                            if (localAuthzProperties[i] != null){
                                        
                                                writeStartElement(null, namespace, "authzProperties", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthzProperties[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://api.user.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "authzProperties", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://api.user.carbon.wso2.org/xsd", "authzProperties", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localDescriptionTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEveryOneRoleNameTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "everyOneRoleName", xmlWriter);
                             

                                          if (localEveryOneRoleName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEveryOneRoleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMultipleCredentialPropsTracker){
                             if (localMultipleCredentialProps!=null) {
                                   namespace = "http://api.user.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localMultipleCredentialProps.length;i++){
                                        
                                            if (localMultipleCredentialProps[i] != null){
                                        
                                                writeStartElement(null, namespace, "multipleCredentialProps", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMultipleCredentialProps[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://api.user.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "multipleCredentialProps", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://api.user.carbon.wso2.org/xsd", "multipleCredentialProps", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localPasswordsExternallyManagedTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "passwordsExternallyManaged", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("passwordsExternallyManaged cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordsExternallyManaged));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPersistedTimestampTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "persistedTimestamp", xmlWriter);
                             

                                          if (localPersistedTimestamp==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersistedTimestamp));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "primary", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("primary cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRealmClassNameTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "realmClassName", xmlWriter);
                             

                                          if (localRealmClassName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRealmClassName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRealmPropertiesTracker){
                             if (localRealmProperties!=null) {
                                   namespace = "http://api.user.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRealmProperties.length;i++){
                                        
                                            if (localRealmProperties[i] != null){
                                        
                                                writeStartElement(null, namespace, "realmProperties", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealmProperties[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://api.user.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "realmProperties", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://api.user.carbon.wso2.org/xsd", "realmProperties", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localSecondaryRealmConfigTracker){
                                    if (localSecondaryRealmConfig==null){

                                        writeStartElement(null, "http://api.user.carbon.wso2.org/xsd", "secondaryRealmConfig", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSecondaryRealmConfig.serialize(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","secondaryRealmConfig"),
                                        xmlWriter);
                                    }
                                } if (localTenantIdTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "tenantId", xmlWriter);
                             
                                               if (localTenantId==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tenantId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserStoreClassTracker){
                                    namespace = "http://api.user.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "userStoreClass", xmlWriter);
                             

                                          if (localUserStoreClass==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserStoreClass);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserStorePropertiesTracker){
                             if (localUserStoreProperties!=null) {
                                   namespace = "http://api.user.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localUserStoreProperties.length;i++){
                                        
                                            if (localUserStoreProperties[i] != null){
                                        
                                                writeStartElement(null, namespace, "userStoreProperties", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserStoreProperties[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://api.user.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "userStoreProperties", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://api.user.carbon.wso2.org/xsd", "userStoreProperties", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://api.user.carbon.wso2.org/xsd")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAddAdminTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "addAdmin"));
                                 
                                         elementList.add(localAddAdmin==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddAdmin));
                                    } if (localAdminPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "adminPassword"));
                                 
                                         elementList.add(localAdminPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminPassword));
                                    } if (localAdminRoleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "adminRoleName"));
                                 
                                         elementList.add(localAdminRoleName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminRoleName));
                                    } if (localAdminUserNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "adminUserName"));
                                 
                                         elementList.add(localAdminUserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminUserName));
                                    } if (localAuthorizationManagerClassTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "authorizationManagerClass"));
                                 
                                         elementList.add(localAuthorizationManagerClass==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorizationManagerClass));
                                    } if (localAuthzPropertiesTracker){
                            if (localAuthzProperties!=null){
                                  for (int i = 0;i < localAuthzProperties.length;i++){
                                      
                                         if (localAuthzProperties[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "authzProperties"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthzProperties[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "authzProperties"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "authzProperties"));
                                    elementList.add(null);
                                
                            }

                        } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "description"));
                                 
                                         elementList.add(localDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                    } if (localEveryOneRoleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "everyOneRoleName"));
                                 
                                         elementList.add(localEveryOneRoleName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEveryOneRoleName));
                                    } if (localMultipleCredentialPropsTracker){
                            if (localMultipleCredentialProps!=null){
                                  for (int i = 0;i < localMultipleCredentialProps.length;i++){
                                      
                                         if (localMultipleCredentialProps[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "multipleCredentialProps"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMultipleCredentialProps[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "multipleCredentialProps"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "multipleCredentialProps"));
                                    elementList.add(null);
                                
                            }

                        } if (localPasswordsExternallyManagedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "passwordsExternallyManaged"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordsExternallyManaged));
                            } if (localPersistedTimestampTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "persistedTimestamp"));
                                 
                                         elementList.add(localPersistedTimestamp==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersistedTimestamp));
                                    } if (localPrimaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "primary"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary));
                            } if (localRealmClassNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "realmClassName"));
                                 
                                         elementList.add(localRealmClassName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealmClassName));
                                    } if (localRealmPropertiesTracker){
                            if (localRealmProperties!=null){
                                  for (int i = 0;i < localRealmProperties.length;i++){
                                      
                                         if (localRealmProperties[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "realmProperties"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealmProperties[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "realmProperties"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "realmProperties"));
                                    elementList.add(null);
                                
                            }

                        } if (localSecondaryRealmConfigTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "secondaryRealmConfig"));
                            
                            
                                    elementList.add(localSecondaryRealmConfig==null?null:
                                    localSecondaryRealmConfig);
                                } if (localTenantIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "tenantId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
                            } if (localUserStoreClassTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                      "userStoreClass"));
                                 
                                         elementList.add(localUserStoreClass==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserStoreClass));
                                    } if (localUserStorePropertiesTracker){
                            if (localUserStoreProperties!=null){
                                  for (int i = 0;i < localUserStoreProperties.length;i++){
                                      
                                         if (localUserStoreProperties[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "userStoreProperties"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserStoreProperties[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "userStoreProperties"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd",
                                                                              "userStoreProperties"));
                                    elementList.add(null);
                                
                            }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static RealmConfiguration parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RealmConfiguration object =
                new RealmConfiguration();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"RealmConfiguration".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RealmConfiguration)org.wso2.carbon.um.ws.service.dao.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list14 = new java.util.ArrayList();
                    
                        java.util.ArrayList list18 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","addAdmin").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAddAdmin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","adminPassword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdminPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","adminRoleName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdminRoleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","adminUserName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdminUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","authorizationManagerClass").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuthorizationManagerClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","authzProperties").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list6.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list6.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone6 = false;
                                            while(!loopDone6){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone6 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","authzProperties").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list6.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone6 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setAuthzProperties((java.lang.String[])
                                                        list6.toArray(new java.lang.String[list6.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","description").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","everyOneRoleName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEveryOneRoleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","multipleCredentialProps").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list9.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list9.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","multipleCredentialProps").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list9.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list9.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setMultipleCredentialProps((java.lang.String[])
                                                        list9.toArray(new java.lang.String[list9.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","passwordsExternallyManaged").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"passwordsExternallyManaged" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordsExternallyManaged(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","persistedTimestamp").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPersistedTimestamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","primary").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"primary" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","realmClassName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRealmClassName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","realmProperties").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list14.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list14.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone14 = false;
                                            while(!loopDone14){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone14 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","realmProperties").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list14.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list14.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone14 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRealmProperties((java.lang.String[])
                                                        list14.toArray(new java.lang.String[list14.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","secondaryRealmConfig").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSecondaryRealmConfig(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSecondaryRealmConfig(org.wso2.carbon.user.api.xsd.RealmConfiguration.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","tenantId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tenantId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTenantId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTenantId(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","userStoreClass").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserStoreClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","userStoreProperties").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list18.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list18.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone18 = false;
                                            while(!loopDone18){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone18 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://api.user.carbon.wso2.org/xsd","userStoreProperties").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list18.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list18.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone18 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setUserStoreProperties((java.lang.String[])
                                                        list18.toArray(new java.lang.String[list18.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    