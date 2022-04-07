package practice.firstProgramme;

import java.util.Scanner;

public class Practice28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your first name");
        String firstName = scan.nextLine();
        System.out.println("Write your last name");
        String lastName = scan.nextLine();
        char f = firstName.charAt(firstName.length()-1);
        char l = lastName.charAt(lastName.length()-1);
        System.out.println(f+ "."+l);
        scan.close();
    }
}
