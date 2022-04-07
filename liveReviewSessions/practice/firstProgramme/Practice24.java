package practice.firstProgramme;

import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("enter a decimal: ");
        double num2 = input.nextDouble();


        System.out.println("Addition: "+(num1+num2));
    }
}
