package pattern.creational.abstract_factory.model;

import pattern.creational.abstract_factory.ColorRed;

public class PigColorRed implements ColorRed {
    @Override
    public void create() {
        System.out.println("Create pig color red");
    }
}
