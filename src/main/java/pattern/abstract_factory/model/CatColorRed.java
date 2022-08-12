package pattern.abstract_factory.model;

import pattern.abstract_factory.ColorRed;

public class CatColorRed implements ColorRed {
    @Override
    public void create() {
        System.out.println("Create cat color red");
    }
}
