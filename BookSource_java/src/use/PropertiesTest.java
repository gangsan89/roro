package use;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		InputStream inStream=
				PropertiesTest.class.getResourceAsStream("/setup.properties");
		FileInputStream stream= new FileInputStream("D:/works/BookSource_java/src/setup.properties");
		
		prop.load(inStream);
		prop2.load(stream);
		
		System.out.println(prop.getProperty("hi"));
		System.out.println(prop2.getProperty("hi"));
		
		
		prop.setProperty("server", "192.168.1.100");
		prop.setProperty("timeout", "5000");
		System.out.println(prop.getProperty("server"));
		System.out.println(prop.getProperty("timeout"));
		OutputStream out = new FileOutputStream("D:/works/BookSource_java/src/setup.properties");
		prop.store(out, "wewe");
		
	}

}


