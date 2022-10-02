package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * scifi.properties
 * rocket=saturn5
 * moon=landing
 */
public class PropertiesReadDemo {
    public static void main(String[] args) throws IOException {
        Properties properties= new Properties();
        // load a properties file
        properties.load(new FileInputStream("./src/main/java/scifi.properties"));
        System.out.println(properties.getProperty("rocket","?"));
        System.out.println(properties.getProperty("earth"));
        System.out.println(properties.getProperty("earth","?"));
        //output saturn5 null ?
    }
}
