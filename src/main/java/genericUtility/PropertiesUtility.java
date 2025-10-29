package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertiesUtility {
    public String getDataFromPropertiesFile(String key) throws IOException {
        FileInputStream fis = new FileInputStream(IpathUtility.textFilePath) ;
            Properties prop = new Properties();
            prop.load(fis);
            return prop.getProperty(key);
        
    }
    
}
