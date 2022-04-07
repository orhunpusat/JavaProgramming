package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = "aabcccd";
        char ch = 'b';

        int frequency = 0;

        for (int i = 0; i < str.length() ; i++) {
            char eachChar = str.charAt(i);
            if(eachChar==ch){
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
/*
2. Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */