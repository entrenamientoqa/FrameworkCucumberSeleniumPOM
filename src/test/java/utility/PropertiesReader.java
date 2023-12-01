/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package utility
 * Contains classes and methods that provide utility functions or auxiliary services
 * that are used in various places in your automation code.
 */

package utility;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesReader {
    private final Properties properties;
    public PropertiesReader() {
        this.properties = new Properties();
        try (InputStream input = Files.newInputStream(Paths.get("config.properties"))) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getWebURL() {
        return properties.getProperty("web.url");
    }

    public int getWebWait() {
        return Integer.parseInt(properties.getProperty("web.wait"));
    }


}
