package pattern.creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Area {
    List<Object> list = new ArrayList<>();


    public void addHouse(String name) {
        list.add(name);
    }

    public String showAll() {
        return Arrays.toString(list.toArray());
    }
}
