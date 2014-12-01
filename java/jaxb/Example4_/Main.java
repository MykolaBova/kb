import java.io.*;  
  
import javax.xml.bind.*;  
  
///import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;  
 // http://bugs.java.com/bugdatabase/view_bug.do;jsessionid=1711ee4eae3ff10565fc7a212018?bug_id=6778491
  
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
  
public class Main  
{  
 public static void main( String[] args ) throws Exception  
 {  
  Item i1 = new Item();  
  i1.text = "hello";  
  i1.id = 1;  
    
  Item i2 = new Item();  
  i2.text = "<code><helloworld></helloworld></code>";  
  i2.id = 2;  
      
  Marshaller m = JAXBContext.newInstance( Item.class ).createMarshaller();  
  //m.setProperty( "com.sun.xml.internal.bind.CharacterEscapeHandler", new CharacterEscapeHandler() {  
  m.setProperty( "com.sun.xml.bind.marshaller.CharacterEscapeHandler", new CharacterEscapeHandler() {  
  
   ///@Override  
   public void escape( char[] ac, int i, int j, boolean flag, Writer writer ) throws IOException  
   {  
    // do not escape  
    writer.write( ac, i, j );  
   }  
  });  
    
  m.marshal( i1, new OutputStreamWriter( System.out ) );  
  System.out.println();  
  m.marshal( i2, new OutputStreamWriter( System.out ) );  
 }  
}  