package pattern.creational.abstract_factory;

import pattern.creational.abstract_factory.sub_factory.CatFactory;
import pattern.creational.abstract_factory.sub_factory.FurnitureAbstractFactory;
import pattern.creational.abstract_factory.sub_factory.PigFactory;

public class SupperFactory {
    private SupperFactory() {}

    public static FurnitureAbstractFactory getFactory(AnimalsType type) {
        switch (type) {
            case CAT: return new CatFactory();
            case PIG: return new PigFactory();
        }
        return null;
    }
}
