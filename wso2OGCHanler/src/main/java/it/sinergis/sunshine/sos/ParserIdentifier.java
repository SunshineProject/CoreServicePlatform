package it.sinergis.sunshine.sos;

import it.sinergis.sunshine.MalformedIdentifierException;

import javax.naming.directory.InvalidAttributesException;

public class ParserIdentifier {
	public final static String HEADERPROCEDURE = "http://www.sunshineproject.eu/swe/procedure/";
	public final static String HEADERFOI = "http://www.sunshineproject.eu/swe/featureOfInterest/";
	public final static String HEADEROBSERVATION = "http://www.sunshineproject.eu/swe/observation/";
	public final static String HEADEROFFERING = "http://www.sunshineproject.eu/swe/offering/";
	
	public final static int TYPEPROCEDURE = 1;
	public final static int TYPEFOI = 2;
	public final static int TYPEOBSERVATION = 3;
	public final static int TYPEOFFERING = 4;
	
	private final static int WSSIZE =3;  
	
	
	public static void main (String args[]) throws InvalidAttributesException, MalformedIdentifierException{
		String identifier = "http://www.sunshineproject.eu/swe/featureOfInterest/ROV";
		getWorkspace(identifier, TYPEFOI);
	
	}
	
	public static String getWorkspace(String identifier, int type ) throws InvalidAttributesException, MalformedIdentifierException {
		String header;
		System.out.println(type);
		switch (type) {
			case TYPEPROCEDURE:
				header = HEADERPROCEDURE;
				break;
			case TYPEFOI:			
				header = HEADERFOI;				
				break;
			case TYPEOBSERVATION:
				header = HEADEROBSERVATION;
				break;				
			case TYPEOFFERING:
				header = HEADEROFFERING;
				break;
			default:
				throw new InvalidAttributesException();
				//return null;
				//TODO return errore
				
		}
		identifier=identifier.trim();
		int i = identifier.indexOf(header);
		int size = header.length();
		System.out.println(identifier);
		if (i != 0 ){
			throw new MalformedIdentifierException();
		}
		if (size + WSSIZE > identifier.length() ){
			throw new MalformedIdentifierException();
		}
		String workspace = identifier.substring(size, size + WSSIZE);
		System.out.println(workspace);
		return workspace;
		
	}
	
	
	
	
	
}
