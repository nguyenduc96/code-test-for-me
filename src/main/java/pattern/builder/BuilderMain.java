package pattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        var director = new Director();
        var builder = new ConcreteBuilder();

        director.builder(builder);
        director.buildHouse1();
        director.buildAll();
        System.out.println(builder.getArea().showAll());
    }
}
