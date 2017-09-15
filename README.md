# Java CSV (JCSV)
A Simple CSV Reader and Writer Classes for Java.

## Usage
### Reading a CSV File
```java
try {
  CSVReader Reader = new CSVReader(Source);
  while ((Data = Reader.readRow()) != null) {
    /* *** */
  }
	Reader.close();
} catch (IOException e) {
	System.out.println(e);
}
```

## Support
<p>Contact me directly via email for support at <a href="mailto:bamberjp@gmail.com">bamberjp@gmail.com</a>. Feel free to share how you are using this code in your own projects. </p>
