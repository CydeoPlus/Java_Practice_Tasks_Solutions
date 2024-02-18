package day14_abstraction_polymorphism.device_task;

public final class Samsung extends Phone implements AndroidApps{
    public Samsung( String model, String color, String size, double price) {
        super("Samsung", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}