/**
 * @author rahul.rathore
 *	
 *	20-Jul-2016
 */
package com.mytestproject.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {


	public static String getResourcePath(String resource) {
		String path = System.getProperty("user.dir")+ resource;

	//	String path =  resource;
		return path;
	}


	public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException {
		return new FileInputStream(ResourceHelper.getResourcePath(resource));
	}

	
}
