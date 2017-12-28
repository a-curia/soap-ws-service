## SOAP Web Service

WSDL - Interface

"binding" - what foes into the service and what goes out of the service
 
Contract first vs Implementation First
 
Understanding WSDL

Customizing the WSDL(Contract first approach)

Schema Types and Binding Styles: explore the two styles we can choose from for our WSDL - Document style and RPC style
@SOAPBinding(style=DOCUMENT or RPC); use=ENCODED or LITERAL
DOCUMENT style is the default SOAP binding; use the annotation to change to RPC style - the types section will not be present anymore, and message will have this information inside
When RPC style is used, no schema gets generated for types
To change the argument name use @WebParam(partName="lookupInput") and for the response @WebResult(partName="lookupOutput")
If you get and return Strings or simple types, you can use RPC, in all the other cases use DOCUMENT type; Using the XSD you can validate you soap request and response

Service Interface and Custom Types
Separate interfaces from implementation, use annotation only on interface(SEI), not on implementation

Using JAXB Annotations 
- understand how an XML binding framework like JAXB works to help convert our object instances to XML
- Java Architecture for XML Binding - convert object to xml and xml to object
- JAXB Annotations: @XmlRootElement(name="Product"); @XmlType(propOrder={"price","sku","name"}); on getter methods @XmlElement(name, default Value, nillable...); public no-arg constructor is needed so that JAXB needs to initialize a new instance of the class; JAXB does XML to Java object conversion too! Which is why it needs a no-args constructor - it will need to instantiate the object first;
- @WebResult

Handling Faults
- web services return 'Fault' messages to denote error scenarios


SoapUI
- Community SoapUI
- learn about the Web Service Explorer tool that come with Eclipse to test and examine web services

Using Endpoint
- there is an alternative way of publishing and running web services without having to use any app servers 
- we'll use the Endpoint class to publish our web service
- javax.xml.ws.Endpoint; metro reference is present in jdk

WSIMPORT
wsimport [options] <WSDL URL>
wsimport -d <directory> : where you want the generated classes to go
wsimport -keep : let's you keep the source files(*.java)
wsimport -s <directory> : where you want source java files to be saved
wsimport -verbose
wsimport -quiet
wsimport -p <package_name> : specific package

Web Service -> WSDL -> Stubs
WSDL Type Names -> Java class Names
Binding files - custom xml files used for overriding different... configure specific types.. binding-file.xml
wsimport -b binding_file.xml wsdl
         -p
 











 