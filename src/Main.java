
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

    try {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        BaeldungHandler baeldungHandler = new BaeldungHandler();

        saxParser.parse("http://www.geoplugin.net/xml.gp?base_currency=USD", baeldungHandler);
        System.out.println(saxParser + " " + baeldungHandler);

    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }

    }
}
