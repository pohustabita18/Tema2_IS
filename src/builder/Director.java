package builder;

public class Director {
    public void constructSportsCar(CarBuilder builder) {
        builder.buildEngine();
        builder.buildSeats();
        builder.buildGPS();
    }
}
