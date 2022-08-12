package pattern.abstract_factory;

import pattern.abstract_factory.sub_factory.FurnitureAbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = SupperFactory.getFactory(AnimalsType.CAT);

        ColorRed colorRed = factory.createColorRed();
        colorRed.create();
    }
}
