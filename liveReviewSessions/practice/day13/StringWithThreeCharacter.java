package practice.day13;

import java.util.Scanner;

public class StringWithThreeCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write a word");
        String word = scan.nextLine();

        int length = word.length();
        String result = "";
        if (length == 0){
            result="Empty";
        }else if(length>3){
            int lastİndex = word.length()-1;
            result=""+word.charAt(length-3)+word.charAt(length-2)+word.charAt(length-1);
        }else{
            result=word;
        }
        System.out.println(result);
        scan.close();

    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */