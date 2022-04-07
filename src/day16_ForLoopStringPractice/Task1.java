package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 5 times");
        int numPos = 0;
        int numNeg = 0;

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            if(num>0){
                numPos++;
            }else if(num<0){
                numNeg++;
            }
        }
        System.out.println("numPos = " + numPos+" numNeg= "+numNeg);
        scan.close();
    }
}
/*
1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
