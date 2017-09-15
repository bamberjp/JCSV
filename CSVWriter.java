/**
 * CSVWriter Class
 */

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CSVWriter {
	/**
	  * BufferedWriter
	  *
	  * @var java.io.BufferedWriter
	  */
	private BufferedWriter Writer;
	
	/**
	  * Constructor
	  *
	  * @param java.io.File Output File.
	  * 
	  * @throws java.io.IOException If unable to write to the Output File.
	  * 
	  * @return void
	  */
	public CSVWriter(File Output) throws IOException {
	    try {
	    	Writer = new BufferedWriter(new FileWriter(Output));
	    } catch (IOException e) {
			throw e;
		}
	}
	
	/**
	  * Writes a row of data to the Output CSV File
	  * 
	  * @param String[] Array of String data
	  * 
	  * @throws java.io.IOException If unable to read from Source file.
	  * 
	  * @return void
	  */
	public void writeRow(String[] Row) throws IOException {
	    try {
	    	String sRow = new String("");
	    	
	    	for (int i = 0; i < Row.length; i++) {
	    		if (i != Row.length - 1) {
	    			sRow += Row[i] + ",";
	    		} else {
	    			sRow += Row[i] + "\n";
	    		}
	    	}
	    	
	    	Writer.write(sRow);
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
	    	Writer.close();
	    } catch (IOException e) {
			throw e;
		}
	}
}
