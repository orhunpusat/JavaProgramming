package day03_EscapeSequences;

public class Println_VS_Print2 {
    public static void main(String[] args) { //main method
        System.out.println("Knock Knock"); // first it prints knock knock,then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");
        System.out.println("-----------------------");
        System.out.print("Knock Knock"); // prints knock knock, does not append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Hello everyone, how are you all? Today we will learn Escape Sequences, and next week we will learn Variables");
        System.out.println("-----------------------");

        System.out.print("Hello everyone,");
        System.out.print("how are you all?");
        System.out.print("Today we will learn Escape Sequences,");
        System.out.println("and next week we will learn Variables");
    }
}

