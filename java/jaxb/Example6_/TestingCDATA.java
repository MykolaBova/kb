import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sun.xml.txw2.annotation.XmlCDATA;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestingCDATA {

    @XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String name;
    @XmlElement
    @XmlJavaTypeAdapter(value = AdaptorCDATA.class)
    private String surname;

    @XmlCDATA
    public String getName() {
        return name;
    }
    @XmlCDATA
    public void setName(String name) {
        this.name = name;
    }
    @XmlCDATA
    public String getSurname() {
        return surname;
    }
    @XmlCDATA
    public void setSurname(String surname) {
        this.surname = surname;
    }
}