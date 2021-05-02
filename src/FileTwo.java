import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

 public class FileTwo extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        System.out.println("---------------------------");
        System.out.println("Start Element :" + " " + uri + " " + qName);

    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        System.out.println("End Element :" + qName);
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {

        System.out.println("characters :");
            System.out.println(new String(ch, start, length));


    }

}