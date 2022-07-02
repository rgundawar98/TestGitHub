package PropertiesPracticals;

import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Create an object of FileWriter class  to append the new data in properties file you have to write ,true after file location
//	    FileWriter fw = new FileWriter("C:\\Users\\Admin\\workspace\\TestField\\src\\PropertiesPracticals\\TestData1.properties",true);

		//to write data in properties file we can also create an object of FileOutputStream instead of FileWriter
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\workspace\\TestField\\src\\PropertiesPracticals\\TestData1.properties",true);
		
		//create an object of properties file
		Properties p = new Properties();
		
		// use SetProperty() method to set prpoerty in file
		 p.setProperty("url", "www.stackoverflow.com");
		 p.store(fos, "sample comments");
		
	}

}
