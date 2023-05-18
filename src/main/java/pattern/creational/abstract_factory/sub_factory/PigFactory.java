package pattern.creational.abstract_factory.sub_factory;

import pattern.creational.abstract_factory.ColorBlue;
import pattern.creational.abstract_factory.ColorRed;
import pattern.creational.abstract_factory.model.PigColorBlue;
import pattern.creational.abstract_factory.model.PigColorRed;

public class PigFactory extends  FurnitureAbstractFactory{
    @Override
    public ColorBlue createColorBlue() {
        return new PigColorBlue();
    }

    @Override
    public ColorRed createColorRed() {
        return new PigColorRed();
    }
}
