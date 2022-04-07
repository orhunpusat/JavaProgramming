package day17_While_DoWhile;

public class Task1 {
    public static void main(String[] args) {
        int num1 =30;
        int num2 =4;

        int count =0;

        while (num1>=num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count+" "+num1);

    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */
