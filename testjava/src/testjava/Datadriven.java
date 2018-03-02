package testjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Ramnew\\git\\qarepo\\testjava\\src\\testjava\\datadrive.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("userid"));
	
	}

}

