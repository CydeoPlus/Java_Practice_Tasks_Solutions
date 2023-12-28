package day07_class_objects_part1;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length = 5.5;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 7.5;
        rectangle2.length = 20;

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());

    }

}
