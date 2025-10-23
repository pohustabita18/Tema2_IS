package builder;

public class Car {
    private String engine;
    private int seats;
    private boolean gps;

    public void setEngine(String engine) { this.engine = engine; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setGPS(boolean gps) { this.gps = gps; }

    @Override
    public String toString() {
        return "Car {" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", gps=" + gps +
                '}';
    }
}
