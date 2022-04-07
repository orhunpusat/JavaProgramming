package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();  // reads the input until a space

        System.out.println("name = " + name);

        input.close();

    }
}
