# Java CSV (JCSV)
A Simple CSV Reader and Writer Classes for Java.

## Usage
### Reading a CSV File
```java
try {
	File Source = new File("example.csv");
  	CSVReader Reader = new CSVReader(Source);
  	while ((Data = Reader.readRow()) != null) {
    	/* *** */
  	}
	Reader.close();
} catch (IOException e) {
	System.out.println(e);
}
```
### Writing a CSV File
```java
try {
	File Output = new File("example.csv");
  	CSVWriter Writer = new CSVWriter(Output);
  	String[] Data = new String[3];
  	   	 Data[0] = new String("Hello");
	  	 Data[1] = new String("World");
	  	 Data[2] = new String("Hello World");
  	Writer.writeRow(Data);
 	Writer.close();
} catch (IOException e) {
	System.out.println(e);
}
```

## Support
<p>Contact me directly via email for support at <a href="mailto:bamberjp@gmail.com">bamberjp@gmail.com</a>. Feel free to share how you are using this code in your own projects. </p>
