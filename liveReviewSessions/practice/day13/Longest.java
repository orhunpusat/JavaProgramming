package practice.day13;

import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String firstSentence = scan.nextLine();
        System.out.println("enter a word again");
        String secondSentence = scan.nextLine();

        int f = firstSentence.length();
        int s = secondSentence.length();

        if(f>s){
            System.out.println(firstSentence);
        }else if(s>f){
            System.out.println(secondSentence);
        }else
            System.out.println("Both have same length");

        scan.close();

    }
}
