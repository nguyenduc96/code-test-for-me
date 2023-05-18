package pattern.creational.abstract_factory.sub_factory;

import pattern.creational.abstract_factory.ColorBlue;
import pattern.creational.abstract_factory.ColorRed;
import pattern.creational.abstract_factory.model.CatColorBlue;
import pattern.creational.abstract_factory.model.CatColorRed;

public class CatFactory extends  FurnitureAbstractFactory{
    @Override
    public ColorBlue createColorBlue() {
        return new CatColorBlue();
    }

    @Override
    public ColorRed createColorRed() {
        return new CatColorRed();
    }
}
