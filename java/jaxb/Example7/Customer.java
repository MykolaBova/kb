import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlCDATA;
 
@XmlRootElement(name="c")
public class Customer {
 
   private String bio;
 
   @XmlCDATA
   public void setBio(String bio) {
      this.bio = bio;
   }
 
   public String getBio() {
      return bio;
   }
 
}