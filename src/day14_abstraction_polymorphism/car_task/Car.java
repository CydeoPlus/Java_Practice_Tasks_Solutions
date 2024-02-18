package day14_abstraction_polymorphism.car_task;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty()) {
            terminate("Invalid make: " + make);
        }
        this.make = make;
        if (model == null || model.isEmpty()) {
            terminate("Invalid model: " + model);
        }
        this.model = model;
        if (year < 1886) {
            terminate("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    private void terminate(String message) {
        System.err.println(message);
        System.exit(1);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            terminate("Invalid make: " + color);
        }
        this.color = color;
    }

    public abstract void drive();

    public abstract void start();

    public final void stop() {
        System.out.println("Press the break to stop the car " + make + " " + model);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */