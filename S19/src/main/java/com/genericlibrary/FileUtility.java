package com.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

 
/**
 * @author RAMA
 * This CLass is having Mtd related to file handling
 */
public class FileUtility{

	/**
	 * @author RAMA
	 * This Mthd is Going to read data from Property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDatafrompropfile(String key) throws IOException 
	{

		FileInputStream fis = new FileInputStream(IPathConstants.propPath);	
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	/**
	 * @author RAMA
	 *  This method is going to read data from JSON 
	 * @param key (Data in JSON is stored in KEY and VAlue so pass key )
	 * @return  value (from json file)
	 * @throws IOException
	 * @throws ParseException
	 */
	public String readDatafromJSON(String key) throws IOException, ParseException
	{

		FileReader inputfile = new FileReader(IPathConstants.jsonPath);

		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);

		//type cast the object and just read the data
		@SuppressWarnings("rawtypes")
		HashMap jobj = (HashMap) obj;

		String value = jobj.get(key).toString();

		return value;
	}

	/**
	 * Read the data from XML file
	 * @param node
	 * @return Value from XML 
	 * @throws DocumentException
	 */
	public String readDatafrom_XML(String node) throws DocumentException 
	{

		File inputfile = new File(IPathConstants.xmlPath);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputfile);
		String value = doc.selectSingleNode(node).getText();

		return value;
	}
}
