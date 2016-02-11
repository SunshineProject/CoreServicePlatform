package it.sinergis.sunshine.sos;

import it.sinergis.sunshine.Constant;
import it.sinergis.sunshine.MalformedIdentifierException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;

import javax.naming.directory.InvalidAttributesException;

import net.sf.saxon.expr.CastExpression;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;



public class JSONParserSOS {
	public static void main (String  args[]) throws IOException, InvalidAttributesException, MalformedIdentifierException{
		String url = "testSOS/test1.json";
		String content = new String(Files.readAllBytes(Paths.get(url)));
		/*getVersion(content);
		getRequest(content);
		getProcedure(content);
		getFeatureOfInterest(content);
		getOffering(content);
		getObservationInsert(content);
		getFeatureOfInterestInsert(content);
		getProcedure(content);
		*/
		
		LinkedList<Attribute> attributes =new LinkedList<Attribute>();

		//getVersion(attributes,content);
		//getRequest(attributes,content);			
		//getProcedure(attributes,content);
		
		getFeatureOfInterest(attributes,content);
		getFeatureOfInterestInsert(attributes,content);
		getObservationInsert(attributes,content);
		getOffering(attributes,content);
		
		getProcedure(attributes,content);
		
		getGeneric(content, "procedure", "observation");

	}
	
	public static LinkedList<Attribute> getAttribute(String contet) throws InvalidAttributesException, MalformedIdentifierException{
		LinkedList<Attribute> attributes =new LinkedList<Attribute>();
		
		
		getVersion(attributes,contet);
		getRequest(attributes,contet);			
		getProcedure(attributes,contet);
		getFeatureOfInterest(attributes,contet);
		getOffering(attributes,contet);
		getFeatureOfInterestInsert(attributes,contet);
		getObservationInsert(attributes,contet);
		
		return attributes;
		
	}
	
	
	public static void getFeatureOfInterestInsert(LinkedList<Attribute> attributes,String  content) throws InvalidAttributesException, MalformedIdentifierException{
		String [] list =getFeatureOfInterestInsert(content);
		if (list == null) {
			return;
		}
		for (String s :list) {
			String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEFOI);
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
			attributes.add(a);
		}
	}
	
	public static void getObservationInsert(LinkedList<Attribute> attributes,String  content) throws InvalidAttributesException, MalformedIdentifierException{
		String [] list =getObservationInsert(content);
		if (list == null) {
			return;
		}
		for (String s :list) {
			String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEOBSERVATION);
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
			attributes.add(a);
		}
	}
	
	public static String[] getFeatureOfInterestInsert(String content){
		JSONParser jsonParser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(content);
			//System.out.println( jsonObject.get("observation"));
			JSONObject JSOnobservation = (JSONObject) jsonObject.get("observation");
			JSONObject JSOfeatureOfInterest = (JSONObject) JSOnobservation.get("featureOfInterest");
			JSONObject JSONIdentifier = (JSONObject) JSOfeatureOfInterest.get("identifier");
			String observationIdentifier = (String) JSONIdentifier.get("value");
			System.out.println(observationIdentifier);
			return new String[] {observationIdentifier};

		} catch (ParseException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRORE");        
			e.printStackTrace();
		}

		return null;
		
		
	}
	
	public static String[] getObservationInsert(String content){
		JSONParser jsonParser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(content);
			//System.out.println( jsonObject.get("observation"));
			JSONObject JSOnobservation = (JSONObject) jsonObject.get("observation");
			JSONObject JSONIdentifier = (JSONObject) JSOnobservation.get("identifier");
			String observationIdentifier = (String) JSONIdentifier.get("value");
			System.out.println(observationIdentifier);
			return new String[] {observationIdentifier};

		} catch (ParseException | NullPointerException e) {
			// TODO Auto-generated catch block
			//System.out.println("ERRORE");        
			//e.printStackTrace();
		}

		return null;
		
		
	}
	
	public static String[] getGeneric(String content,String field ){
		JSONParser jsonParser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(content);
			System.out.println( jsonObject.get(field));
            Object fielObject = jsonObject.get(field);
            if (fielObject == null ){
            	return null;
            }
            if (fielObject instanceof String ){
            	String s[]=new String[1] ;
            	s[0]=(String) fielObject;
            	return s ;   	
            }
            if (fielObject instanceof String[] ){            
            	return (String[]) fielObject ;   	
            }
            
            
                  
            //System.out.println("The first name is: " + firstName);         
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	
	public static String[] getGeneric(String content,String field,String parent ){
JSONParser jsonParser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(content);			
			JSONObject obj =(JSONObject)jsonObject.get(parent);
			Object fielObject = obj. get(field);
			
			
			System.out.println( jsonObject.get(parent));
			System.out.println( fielObject);

            if (fielObject == null ){
            	return null;
            }
            if (fielObject instanceof String ){
            	String s[]=new String[1] ;
            	s[0]=(String) fielObject;
            	return s ;   	
            }
            if (fielObject instanceof String[] ){            
            	return (String[]) fielObject ;   	
            }                                       
            //System.out.println("The first name is: " + firstName);         
			
		} catch (ParseException |NullPointerException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	
	}
	
	
	public static String[] getVersion(String content) {
		return getGeneric(content, "version");
	}

	public static String[] getRequest(String content) {
		return getGeneric(content, "request");
	}
	public static String[] getProcedure(String content) {
		return getGeneric(content, "procedure");
	}
	public static String[] getFeatureOfInterest(String content) {
		return getGeneric(content, "featureOfInterest");
	}

	public static String[] getOffering(String content) {
		return getGeneric(content, "offering");
	}
	
	public static void getVersion(LinkedList<Attribute> attributes,String  content){
		String [] list =getVersion(content);
		if (list == null) {
			return;
		}
		for (String s : list) {
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.VERSION, "string", s);
			attributes.add(a);
		}
		
	}
	
	public static void getRequest(LinkedList<Attribute> attributes,String  content){
		String [] list =getRequest(content);
		if (list == null) {
			return;
		}
		for (String s :list) {
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.OPERATION, "string", s.trim().toLowerCase());
			attributes.add(a);
		}
		
	}
		
	public static void getProcedure(LinkedList<Attribute> attributes,String  content) throws InvalidAttributesException, MalformedIdentifierException{
		String [] list =getProcedure(content);
		if (list != null) {			
			for (String s :list) {
				String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEPROCEDURE);
				Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
				attributes.add(a);
			}
		}
		String [] list1 = getGeneric(content, "procedure", "observation");
		if (list1 != null) {			
			for (String s :list1) {
				String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEPROCEDURE);
				Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
				attributes.add(a);
			}
		}
		
		
	}
		
	public static void getFeatureOfInterest(LinkedList<Attribute> attributes,String  content) throws InvalidAttributesException, MalformedIdentifierException{
		String [] list =getFeatureOfInterest(content);
		System.out.println(list);
		if (list == null) {
			return;
		}
		for (String s :list) {
			System.out.println(s);
			String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEPROCEDURE);
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
			attributes.add(a);
		}
		
	}
		
	public static void getOffering(LinkedList<Attribute> attributes,String  content) throws InvalidAttributesException, MalformedIdentifierException{
		String [] list =getOffering(content);
		if (list == null) {
			return;
		}
		for (String s :list) {
			String ws = ParserIdentifier.getWorkspace(s, ParserIdentifier.TYPEOFFERING);
			Attribute a = new Attribute(Constant.RESOURCECATEGORY, Constant.WORKSPACE, "string", ws);
			attributes.add(a);
		}
		
	}
	
}
