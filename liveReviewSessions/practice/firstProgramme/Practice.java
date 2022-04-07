package practice.firstProgramme;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your birthday M/D/Y");
        String birthDay = input.nextLine();

        System.out.println("Enter your experience of year");
        Double experienceOfYear = input.nextDouble();

        input.nextLine();
        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("birthDay = " + birthDay);
        System.out.println("experienceOfYear = " + experienceOfYear);
        System.out.println("companyName = " + companyName);
    }
}
