# CoreServicePlatform
These components are essentially categorized into two big typologies:
*	the database management system;
*	the server software that implements various standard services.

The Sunshine’s platform architecture is service oriented, so services must be secured and an authentication service must be made available to client applications.  The authentication service must also be equipped with auxiliary services in order to let the users manage their own accounts (change password, change user’s details, manage password expiration).

**WSO2 Identity Server:** WSO2 Identity Server provides sophisticated security and identity management of enterprise web applications, services, and APIs. Identity Server acts as an Enterprise Identity Bus able to manage identities over systems and networks, both locally and in the cloud. WSO2 IS provides: System and User Identity Management, User and Groups Provisioning, User and Groups Management, Entitlements Management and XACML 2.0/3.0 Support.

**WSO2 Enterprise Service Bus**: An enterprise service bus (ESB) is a software architecture construct that enables communication among various applications. The advantage is that instead of having to make each of your applications communicate directly with each other in all their various formats, each application simply communicates with the ESB, which handles transforming and routing the messages to their appropriate destinations. WSO2 ESB is 100% open source and is released under Apache Software License Version 2.0, one of the most business-friendly licenses available today. . Using WSO2 ESB you can perform filtering, transforming, and routing SOAP, binary, plain XML, and text messages that pass through systems by HTTP, HTTPS, mail, etc.
