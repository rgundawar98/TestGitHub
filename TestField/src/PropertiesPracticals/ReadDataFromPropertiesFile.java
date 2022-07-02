package PropertiesPracticals;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
    
		//you need to create object of class  fileReader 
//		FileReader fr = new FileReader("C:\\Users\\Admin\\workspace\\TestField\\src\\PropertiesPracticals\\TestData.properties");
	
		//Instead of FileReader class we can also use object of FileInputStream class also
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\workspace\\TestField\\src\\PropertiesPracticals\\TestData.properties");
		
		
		//create an object of properties class
		Properties p = new Properties();
		
		//load the properties file
//		p.load(fr);
        p.load(fis);
        
		//use getproperty method to get properties from file
		System.out.print(p.getProperty("url"));
		

	}

}
