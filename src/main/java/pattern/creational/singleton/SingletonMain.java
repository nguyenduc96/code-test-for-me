package pattern.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();

        Calculator calculator1 = Calculator.getInstance();

        System.out.println(calculator == calculator1);
    }
}
