package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you full name");
        String fullName =scan.nextLine();

        System.out.println("Building number");
        int buildingNum = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your country name");
        String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNum = " + buildingNum);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        scan.close();
    }
}
