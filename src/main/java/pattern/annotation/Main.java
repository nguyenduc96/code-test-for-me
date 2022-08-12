package pattern.annotation;

import pattern.annotation.config.JSON;
import pattern.annotation.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress("ha Noi");
        person.setAge("ha Noi");
        person.setName("ha Noi");
        System.out.println(JSON.toJsonString(person));
    }
}
