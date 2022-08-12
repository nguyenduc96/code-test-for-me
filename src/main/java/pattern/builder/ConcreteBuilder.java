package pattern.builder;

public class ConcreteBuilder implements Builder {
    private Area area = new Area();

    public ConcreteBuilder() {
        this.reset();
    }

    public void reset() {
        this.area = new Area();
    }

    @Override
    public void builderHouse1() {
        this.area.addHouse("House1");
    }

    @Override
    public void builderHouse2() {
        this.area.addHouse("House2");
    }

    @Override
    public void builderHouse3() {
        this.area.addHouse("House3");
    }

    public Area getArea() {
        Area rs = this.area;
        this.reset();
        return rs;
    }
}
