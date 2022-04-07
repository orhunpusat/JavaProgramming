package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll( Arrays.asList(0)  );

        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result);

    }
}

/*
2. Write a program that can move all the zeros to the last indexes of ArrayList
					Ex:
						list: {1,0,2,0,3,0,4,0}
					output:
						[1, 2, 3, 4, 0, 0, 0, 0]

 */