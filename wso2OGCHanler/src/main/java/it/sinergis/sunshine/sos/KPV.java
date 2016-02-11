package it.sinergis.sunshine.sos;

import it.sinergis.sunshine.Constant;
import it.sinergis.sunshine.MalformedIdentifierException;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import javax.naming.directory.InvalidAttributesException;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.wso2.carbon.identity.entitlement.proxy.Attribute;

public class KPV {
	public static void main (String args[]) throws UnsupportedEncodingException, URISyntaxException, InvalidAttributesException, MalformedIdentifierException{
		String p = "http://sunshine.sinergis.it/SOS40/service?service=SOS&version=2.0.0&request=GetDataAvailability&observedProperty=http%3A%2F%2Fwww.52north.org%2Ftest%2FobservableProperty%2F1%2Chttp%3A%2F%2Fwww.52north.org%2Ftest%2FobservableProperty%2F3&procedure=http%3A%2F%2Fwww.52north.org%2Ftest%2Fprocedure%2F1%2Chttp%3A%2F%2Fwww.52north.org%2Ftest%2Fprocedure%2F3&featureOfInterest=http%3A%2F%2Fwww.52north.org%2Ftest%2FfeatureOfInterest%2F1%2Chttp%3A%2F%2Fwww.52north.org%2Ftest%2FfeatureOfInterest%2F3%2Chttp%3A%2F%2Fwww.52north.org%2Ftest%2FfeatureOfInterest%2F4";
		String result = java.net.URLDecoder.decode(p, "UTF-8");
		System.out.println(result);
		getAttributes(p);
							
		System.out.println(result);
		
	}
	
	public static LinkedList<Attribute> getAttributes (String url) throws URISyntaxException, InvalidAttributesException, MalformedIdentifierException{
		List<NameValuePair> params= URLEncodedUtils.parse(new URI (url), "UTF-8");
		LinkedList<Attribute> attrs = new LinkedList<Attribute>();
		/*for (NameValuePair nameValuePair : params) {
			
			System.out.println(nameValuePair.getName() + "_____ " + nameValuePair.getValue());
			
			for(String s: splitResource(nameValuePair.getValue())){
				System.out.println(s);
			}
			
		}*/
		
		
		for (NameValuePair nameValuePair : params) {
			
			String key = nameValuePair.getName().toLowerCase();
			String value = nameValuePair.getValue();
			String ws;
			Attribute a ;
			switch (key) {
			case "version":
				a = new Attribute(Constant.RESOURCECATEGORY,  Constant.VERSION,  "string", value);
				attrs.add(a);
				break;
			
			case "request":
				 a = new Attribute(Constant.RESOURCECATEGORY,  Constant.OPERATION,  "string", value.trim().toLowerCase());
				 attrs.add(a);
				break;
			case "procedure":
				addAttribute(attrs, value, ParserIdentifier.TYPEPROCEDURE, Constant.WORKSPACE);
			
				break;
			case "observation":
				addAttribute(attrs, value, ParserIdentifier.TYPEOBSERVATION, Constant.WORKSPACE);			
				break;
			case "featureofinterest":
				addAttribute(attrs, value, ParserIdentifier.TYPEFOI, Constant.WORKSPACE);				
				break;
			case "offering":
				addAttribute(attrs, value, ParserIdentifier.TYPEOFFERING, Constant.WORKSPACE);				
				break;
			/*case "observation":
				ws = ParserIdentifier.getWorkspace(value, ParserIdentifier.TYPEOBSERVATION);
				 a = new Attribute(Constant.RESOURCECATEGORY,  Constant.SERVICE,  "String", ws);					
				break;*/
			default:
				a = null;
				break;
			}
			
			
		}
		return attrs;
		
		
	}
	
	
	public static ArrayList<String> splitResource (String resources){
		StringTokenizer sts = new StringTokenizer(resources, ",");
		ArrayList<String> as = new ArrayList<String>();
		while (sts.hasMoreElements()) {
				String t = sts.nextToken();
				as.add(t);			
		}
		return as;						
	}
	
	public static void addAttribute(LinkedList<Attribute> attrs,String resources, int type, String identifier ) throws InvalidAttributesException, MalformedIdentifierException{
		ArrayList<String> al = splitResource(resources);
		for (String res : al) {
			String ws = ParserIdentifier.getWorkspace(res,type);			
			Attribute a = new Attribute(Constant.RESOURCECATEGORY,  identifier,  "string", ws);
			attrs.add(a);
		}
	}
	
	
	
	
	
	
	
}
