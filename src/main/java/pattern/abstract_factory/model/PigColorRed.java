package pattern.abstract_factory.model;

import pattern.abstract_factory.ColorRed;

public class PigColorRed implements ColorRed {
    @Override
    public void create() {
        System.out.println("Create pig color red");
    }
}
