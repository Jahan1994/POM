package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1.Properties objesi olusturmak
    //bu objectin projectin her yerinden cagirilmasi icin static yapiyoruz bu object e
    //class disindan mudahele olmamasi icin private yapiyoruz (istersek eyer(opsiyonel))
   static private Properties properties;

   static {
       String path="src//configuration.properties";
       try {
           FileInputStream fileInputStream=new FileInputStream(path);

properties=new Properties();
//bu class calisdiginda static block caliscak ve bir tek islem yapicak
           //fileInputStream object caliscak ve okudugu bilgileri properties objectine yukleyecek

properties.load(fileInputStream);
fileInputStream.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   public static String getProperty(String key){
       String value=properties.getProperty(key);
       return value;

   }

}
