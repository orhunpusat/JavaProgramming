package practice.firstProgramme;

import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = scan.nextLine();

        char f = sentence.charAt(+1);
        char l = sentence.charAt(sentence.length()-2);
        System.out.println(f+" "+l);
        scan.close();
    }
}
