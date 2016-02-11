package it.sinergis.sunshine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;


public class XMLtoJSON {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

    public static void main(String[] args) throws IOException {
    	String url = "testSOS/xmlfjson.xml";
		String content = new String(Files.readAllBytes(Paths.get(url)));
        //System.out.println(content);
		System.out.println(xmlToJSON(content));
		
		return;
        /*try {
            JSONObject xmlJSONObj = XML.toJSONObject(content);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }*/
    }
    public static String xmlToJSON(String xml){
    	 try {
             JSONObject xmlJSONObj = XML.toJSONObject(xml);
             JSONObject xmlJSONObj1 = xmlJSONObj.getJSONObject("jsonObject");
             String jsonPrettyPrintString = xmlJSONObj1.toString(PRETTY_PRINT_INDENT_FACTOR);
             //System.out.println(jsonPrettyPrintString);
             return jsonPrettyPrintString;
         } catch (JSONException je) {
             System.out.println(je.toString());
         }
    	 return null;
    }
    
    
    
    
}