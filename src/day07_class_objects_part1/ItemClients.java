package day07_class_objects_part1;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Pen";
        item1.unitPrice = 1.5;
        item1.quantity = 5;

        Item item2 = new Item();
        item2.itemName = "Notebook";
        item2.unitPrice = 3.5;
        item2.quantity = 10;

        System.out.println(item1);
        System.out.println(item2);


    }

}
