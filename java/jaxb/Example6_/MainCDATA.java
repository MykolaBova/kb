/// http://stackoverflow.com/questions/14193944/jaxb-marshalling-unmarshalling-with-cdata

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

public class MainCDATA {
    public static void main(String args[])
    {
        try
        {
            String name = "<h1>kshitij</h1>";
            String surname = "<h1>solanki</h1>";
//            String id = "<h1>1</h1>";

            TestingCDATA cdata = new TestingCDATA();
//            cdata.setId(id);
            cdata.setName(name);
            cdata.setSurname(surname);

            JAXBContext jaxbContext = JAXBContext.newInstance(TestingCDATA.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.setProperty(CharacterEscapeHandler.class.getName(), new CharacterEscapeHandler() { 
                public void escape(char[] ac, int i, int j, boolean flag,
                Writer writer) throws IOException {
                writer.write( ac, i, j ); }
                });
            StringWriter stringWriter = new StringWriter(); 
            marshaller.marshal(cdata, stringWriter);
            System.out.println(stringWriter.toString());
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }       
    }
}

