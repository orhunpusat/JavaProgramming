package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers); //[8, 2, 3, 4, 5, 6, 7, 1]

        //int[] arr = {1,2,3,4,5,6,7,8};
        // System.out.println( Arrays.toString(arr )  ); Array print like this

    }

}
/*
1. write a program that can swap the first and last elements of an ArrayList

 */