package Service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import model.User;

public class UserService {
    public static String serializeXml(User user) {
        return new XStream(new DomDriver()).toXML(user);
    }

    public static User deSerializeXml(String xmlString) {
        XStream xStream = new XStream(new DomDriver());
        Object o = xStream.fromXML(xmlString);
        return (User) o;
    }
}