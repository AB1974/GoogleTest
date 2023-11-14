package org.Google.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

private static Properties configFile;

static{
    String path = "configuration.properties";
    try
            (FileInputStream fileInputStream =new FileInputStream(path);){
        //location of properties file
        //get that file as a stream
        //create object of Properties class
        configFile= new Properties();
        //load properties file into Properties object
        configFile.load(fileInputStream);
    }catch
    (Exception e){


    };

}

  public static String getProperties (String input){

    return configFile.getProperty(input);
  }
}
