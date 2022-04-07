package practice.day13;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = scan.nextLine();


        char f = sentence.charAt(0);
        char l = sentence.charAt(sentence.length()-1);
        String result = f+" "+l;
        System.out.println("result "+ result);
        scan.close();
    }
}
/*
write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */