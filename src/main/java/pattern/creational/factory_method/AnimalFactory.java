package pattern.creational.factory_method;

/**
 * factory sẽ chịu trách nhiệm khởi tạo một đối tượng
 * với 1 điều kiện nào đó.
 */

public final class AnimalFactory {
    public static Animals getAnimals(AnimalsEnum type) {
        Animals animals;
        switch (type) {
            case DOG:
                animals = new Dogs();
                break;
            case CHICKEN:
                animals = new Chickens();
                break;
            default:
                throw new RuntimeException("");
        }
        return animals;
    }
}
