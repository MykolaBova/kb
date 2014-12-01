import javax.xml.bind.annotation.*;  
import javax.xml.bind.annotation.adapters.*;  

  
@XmlRootElement  
@XmlAccessorType(XmlAccessType.FIELD) 
public class Item  
{  
 @XmlAttribute public int id;  
   
 @XmlJavaTypeAdapter(value=Adapter.class)   
 public String text;  
   
 private static class Adapter extends XmlAdapter<String, String>
 {  
  
  @Override  
  public String marshal( String v ) throws Exception  
  {  
   return "<![CDATA[" + v + "]]>";  
  }  
  
  @Override  
  public String unmarshal( String v ) throws Exception  
  {  
   return v;  
  }  
    
 }  
} 