package pattern.abstract_factory.sub_factory;

import pattern.abstract_factory.ColorBlue;
import pattern.abstract_factory.ColorRed;

public abstract class FurnitureAbstractFactory {
    public abstract ColorBlue createColorBlue();

    public abstract ColorRed createColorRed();
}
