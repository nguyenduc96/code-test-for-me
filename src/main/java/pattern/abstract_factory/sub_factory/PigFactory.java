package pattern.abstract_factory.sub_factory;

import pattern.abstract_factory.ColorBlue;
import pattern.abstract_factory.ColorRed;
import pattern.abstract_factory.model.PigColorBlue;
import pattern.abstract_factory.model.PigColorRed;

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
