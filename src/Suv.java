public class Suv extends Car {
    private String drivetrain;

    public Suv(int doors, int wheels, String maker, String engine, String colour) {
        super(doors, wheels, maker, engine, colour);
        this.drivetrain = "AWD";
    }
}
