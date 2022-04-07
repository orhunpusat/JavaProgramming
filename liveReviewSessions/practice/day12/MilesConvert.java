package practice.day12;

import java.util.Scanner;

public class MilesConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give miles please");
        double miles= scan.nextInt();

        System.out.println(miles+" miles"+ " "+( miles*1.609)+" kilometers");
        scan.close();
    }
}
