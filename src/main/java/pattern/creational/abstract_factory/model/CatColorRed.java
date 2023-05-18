package pattern.creational.abstract_factory.model;

import pattern.creational.abstract_factory.ColorRed;

public class CatColorRed implements ColorRed {
    @Override
    public void create() {
        System.out.println("Create cat color red");
    }
}
