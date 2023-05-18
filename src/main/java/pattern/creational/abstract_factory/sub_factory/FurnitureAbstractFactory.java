package pattern.creational.abstract_factory.sub_factory;

import pattern.creational.abstract_factory.ColorBlue;
import pattern.creational.abstract_factory.ColorRed;

public abstract class FurnitureAbstractFactory {
    public abstract ColorBlue createColorBlue();

    public abstract ColorRed createColorRed();
}
