package day14_abstraction_polymorphism.car_task;

public final class Nio extends Car implements AutoPilot {

    public Nio(String model, String color, int year, double price) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " auto park mode is on");
    }

    @Override
    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + " auto pilot mode is on");
    }
}