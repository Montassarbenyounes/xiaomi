 package Helper;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

public class utiles {
	public static String getproprety (String property) throws Exception {

		InputStream input =new FileInputStream ("src/test/resources/Properties/propreties");
		Properties propreties= new Properties () ; 
		
		

		propreties.load(input) ; 
		return (propreties.getProperty(property)) ;

	 
	}
}
   