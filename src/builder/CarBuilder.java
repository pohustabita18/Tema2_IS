package builder;

public interface CarBuilder {
    void buildEngine();
    void buildSeats();
    void buildGPS();
    Car getResult();
}
