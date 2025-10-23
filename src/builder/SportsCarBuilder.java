package builder;

public class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildSeats() {
        car.setSeats(2);
    }

    @Override
    public void buildGPS() {
        car.setGPS(true);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
