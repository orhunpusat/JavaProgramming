package practice.day13;

import java.util.Scanner;

public class İnitial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name");
        String str1 = scan.nextLine();
        System.out.println("Last name");
        String str2 = scan.nextLine();

        char firstName= str1.toUpperCase().charAt(0);
        char lastName = str2.toUpperCase().charAt(0);

        System.out.println(firstName+"."+lastName);
        scan.close();
    }
}
