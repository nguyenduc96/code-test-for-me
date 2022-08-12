package pattern.abstract_factory.model;

import pattern.abstract_factory.ColorBlue;

public class CatColorBlue implements ColorBlue {
    @Override
    public void create() {
        System.out.println("Create cat color blue");
    }
}
