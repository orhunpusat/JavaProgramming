package practice.day13;

import java.util.Scanner;

public class FirstAndLastSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String word = scan.nextLine();
        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);
        if(f==l){
            System.out.println("Both of them same");
        }else{
            System.out.println(f+" "+l);
        }
    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */