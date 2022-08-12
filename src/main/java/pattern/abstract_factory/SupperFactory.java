package pattern.abstract_factory;

import pattern.abstract_factory.sub_factory.CatFactory;
import pattern.abstract_factory.sub_factory.FurnitureAbstractFactory;
import pattern.abstract_factory.sub_factory.PigFactory;

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
