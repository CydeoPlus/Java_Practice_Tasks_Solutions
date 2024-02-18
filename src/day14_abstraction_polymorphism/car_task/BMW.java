package day14_abstraction_polymorphism.car_task;

public final class BMW extends Car {
    public BMW(String model, String color, int year, double price) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

    @Override
    public void start() {
        System.out.println("You need to call the mechanic to jump-start " + getMake() + " " + getModel());
    }


}