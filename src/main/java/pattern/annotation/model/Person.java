package pattern.annotation.model;

import pattern.annotation.JSONElement;

public class Person {
    @JSONElement("name___")
    private String name;

    @JSONElement("age___")
    private String age;

    @JSONElement("address___")
    private String address;

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
