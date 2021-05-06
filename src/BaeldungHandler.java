import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BaeldungHandler extends DefaultHandler {
    
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {
        System.out.println("startElement: " + qName);
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        System.out.println("endElement: " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        System.out.println("Character: " + new String(ch, start, length));
    }

    }

