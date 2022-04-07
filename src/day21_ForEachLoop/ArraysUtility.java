package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums)); // {1,2,3,4,5}

        System.out.println("------------------------------------");

        int [] scores = {95,100,55,65,85,78};
        Arrays.sort(scores);//{55,......100}

        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length-1]);

        System.out.println("------------------------------------");

        String []names = {"Gunay","Anna","Zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------");
        String [] words = {"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//in asciitable uppercase came before lowercase //[ANNA, Anna]

        System.out.println("-----------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1); //false

        Arrays.sort(arr1);//{1,2,3} //İf boolean true it can be like this
        Arrays.sort(arr2);//{1,2,3}

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("-----------------------------");

        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','c','a'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);


    }
}
