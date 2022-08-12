package pattern.factory_method;

public class FactoryMethodMain {
    public static void main(String[] args) {
       Animals animals = AnimalFactory.getAnimals(AnimalsEnum.DOG);

       animals.eat();
    }
}
