public class Car {
    // State of car (fields)

    private int doors;
    private int wheels;
    private String maker;
    private String engine;
    private String colour;

    public Car(int doors, int wheels, String maker, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.maker = maker;
        this.engine = engine;
        this.colour = colour;
    }
    public Car() {
        // Using constructor by passing default values.
        this(4, 4, "Ford", "V8", "Red");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
