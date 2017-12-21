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




 