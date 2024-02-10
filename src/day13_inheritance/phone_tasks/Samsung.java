package day13_inheritance.phone_tasks;

public class Samsung extends Phone{
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
}

/*
2. Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.
 */
