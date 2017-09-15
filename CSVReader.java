/**
 * CSVReader Class
 */

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSVReader {
	/**
	  * BufferedReader
	  *
	  * @var java.io.BufferedReader
	  */
	private BufferedReader Reader;
	
	/**
	  * Constructor
	  *
	  * @param java.io.File Source Input CSV File.
	  * 
	  * @throws java.io.IOException If unable to read from the Source File.
	  * 
	  * @return void
	  */
	public CSVReader(File Source) throws IOException {
	    try {
	    	Reader = new BufferedReader(new FileReader(Source));
	    } catch (IOException e) {
			throw e;
		}
	}
	
	
	/**
	  * Reads a row of data from the Source CSV File as an Array of String
	  * 
	  * @throws java.io.IOException If unable to read from Source file.
	  * 
	  * @return String[]
	  */
	public String[] readRow() throws IOException {
	    LinkedList<String> Row = new LinkedList<String>();

	    try {
	    	String Line = Reader.readLine();
	    	if (Line == null) return null;
	    	boolean Hold = false;
	    	String Value = new String("");
	    	
	    	for (int i = 0; i<Line.length(); i++) {
	    		switch (Line.charAt(i)) {
	    			case '"':
	    				Hold = !Hold;
	    				break;
	    			case ',':
	    				if (Hold) {
	    					Value += Line.charAt(i);
	    				} else {
	    					Row.add(Value);
	    					Value = "";
	    				}
	    				break;
	    			default:
	    				Value += Line.charAt(i);
	    				break;
	    		}
	    	}
	    	
	    	return Row.toArray(new String[Row.size()]);
	    } catch (IOException e) {
			throw e;
		}
	}
	
	/**
	  * Closes the stream and releases any system resources associated with it.
	  * 
	  * @throws java.io.IOException If unable to read from Source file.
	  * 
	  * @return void
	  */
	public void close() throws IOException {
	    try {
	    	Reader.close();
	    } catch (IOException e) {
			throw e;
		}
	}
}
