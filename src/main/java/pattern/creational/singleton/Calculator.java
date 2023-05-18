package pattern.creational.singleton;

public class Calculator {
    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("Division by zero");
        }
        return a / b;
    }
}
