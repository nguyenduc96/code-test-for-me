package pattern.abstract_factory.model;

import pattern.abstract_factory.ColorBlue;

public class PigColorBlue implements ColorBlue {
    @Override
    public void create() {
        System.out.println("Create pig color blue");
    }
}
