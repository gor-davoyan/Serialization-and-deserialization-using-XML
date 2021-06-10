package com.company.service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.company.model.User;

public class UserService {
    public static String serializeXml(User user) {
        return new XStream(new DomDriver()).toXML(user);
    }

    public static User deSerializeXml(String xmlString) {
        return (User) new XStream(new DomDriver()).fromXML(xmlString);
    }
}