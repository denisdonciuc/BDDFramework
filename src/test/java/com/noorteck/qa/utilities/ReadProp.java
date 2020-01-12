package com.noorteck.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		// Create a Property Class object to access the property file
		Properties prop = new Properties();

		// Create file input stream object for the properties file
		FileInputStream file = new FileInputStream(
				"/Users/iuliapopusoi/Eclipse /BDDFramework/src/test/resources/configs/EnvirementData.properties");

		// Load properties files
		prop.load(file);
		// Get the values using get("key") method or
		// ("key") method by passing key as the parameter

		System.out.println(prop.get("url"));
		System.out.println(prop.getProperty("browserType"));

		// Properties prop = new Properties();

		try {
			// CODE THAT MAY RISEEXEPTION
			file = new FileInputStream(
					"/Users/iuliapopusoi/Eclipse /BDDFramework/src/test/resources/configs/EnvirementData.properties");

			prop.load(file);

			System.out.println(prop.get("url"));
			System.out.println(prop.getProperty("browserType"));
		} catch (Exception e) {
			// REST OF THE PROGRAM

			System.out.println("Exeption Occured: " + e);
			e.printStackTrace();
		}

	}

	public static Properties getProperties(String fillePath) {

		Properties prop = new Properties();
		FileInputStream file;

		try {
			
			file = new FileInputStream(fillePath);

			prop.load(file);

		} catch (Exception e) {

			System.out.println("Exeption Occured: " + e);
			e.printStackTrace();
		}
		return prop;

	}

}
