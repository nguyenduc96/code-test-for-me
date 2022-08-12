package pattern.abstract_factory.sub_factory;

import pattern.abstract_factory.ColorBlue;
import pattern.abstract_factory.ColorRed;
import pattern.abstract_factory.model.CatColorBlue;
import pattern.abstract_factory.model.CatColorRed;

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
