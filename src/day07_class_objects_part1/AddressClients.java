package day07_class_objects_part1;

public class AddressClients {

    public static void main(String[] args) {

        Address officeAddress = new Address();
        officeAddress.buildingNumber = 7925;
        officeAddress.street = "Jones Branch Dr";
        officeAddress.city = "McLean";
        officeAddress.state = "VA";
        officeAddress.zipcode = 22102;

        System.out.println(officeAddress);


        System.out.println("----------------------");

        Address homeAddress = new Address();
        homeAddress.buildingNumber = 12341;
        homeAddress.street = "Legacy Circle Rd";
        homeAddress.city = "Miami";
        homeAddress.state = "FL";
        homeAddress.zipcode = 33125;

        System.out.println(homeAddress);


    }

}
