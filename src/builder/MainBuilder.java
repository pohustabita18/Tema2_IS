package builder;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new SportsCarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println(car);
    }
}
