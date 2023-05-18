package annotation;

import annotation.config.JSON;
import annotation.model.Person;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Person person = new Person();
        person.setAddress("ha Noi");
        person.setAge("ha Noi");
        person.setName("ha Noi");
        System.out.println(JSON.toJsonString(person));

    }
}
