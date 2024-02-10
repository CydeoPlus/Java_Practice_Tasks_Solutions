package day13_inheritance.phone_tasks;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 12", "6.1 inches", 999.99, "Blue");
        Samsung samsung = new Samsung("Galaxy S21", "6.2 inches", 899.99, "Black");
        Nokia nokia = new Nokia("Brick", "2.4 inches", 49.99, "Gray");

        System.out.println("IPhone:");
        System.out.println(iPhone);
        iPhone.call("1234567890");
        iPhone.text("1234567890");

        System.out.println("Samsung:");
        System.out.println(samsung);
        samsung.call("9876543210");

        System.out.println("Nokia:");
        System.out.println(nokia);
        nokia.text("987654321");


    }

}

/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */