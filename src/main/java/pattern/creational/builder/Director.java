package pattern.creational.builder;

public class Director {
    private Builder builder;

    public Builder builder(Builder builder) {
        this.builder = builder;
        return this.builder;
    }

    public void buildHouse1() {
        this.builder.builderHouse1();
    }

     public void buildAll() {
        this.builder.builderHouse1();
        this.builder.builderHouse2();
        this.builder.builderHouse3();
    }
}
