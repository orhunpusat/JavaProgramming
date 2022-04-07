package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice4_NextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();//öncesinde nextint olduğu için koyuluyor.koymazsan sonrakini pas geçiyor.

        System.out.println("Enter you school name");
        String schoolname = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolname = " + schoolname);


        input.close();



    }
}
