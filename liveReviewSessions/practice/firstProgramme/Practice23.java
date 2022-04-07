package practice.firstProgramme;

import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Enter a decimal: ");
        double num1 = input.nextDouble();

        System.out.println(num);
        System.out.println(num1);
        System.out.println("Addition: "+(num+num1));

        input.close();
    }

}
