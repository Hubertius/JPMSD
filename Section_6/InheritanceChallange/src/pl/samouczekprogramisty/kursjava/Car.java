package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.Car;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Set gear: " + currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Changed velocity to: " + speed + " and direction to: " + direction);
    }


}
