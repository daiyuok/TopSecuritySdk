package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private static PropertiesUtil configuration = new PropertiesUtil();

    private Properties pros = null;

    public static PropertiesUtil getInstance() {
        return configuration;
    }

    public String getValue(String key) {
        return pros.getProperty(key);
    }

    private PropertiesUtil() {
        readConfig();
    }

    private void readConfig() {
        pros = new Properties();
        InputStream in = null;
        try {
            in = new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("").getPath() + "sdk.properties");
            pros.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}