package day16_ForLoopStringPractice;

public class Task5 {
    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        int countDog =0;
        int countCat =0;

        for (int i = 0; i <=str.length()-3 ; i++) {
            String s = str.substring(i,i+3);
            if(s.equalsIgnoreCase("dog")){
                countDog++;
            }
            if(s.equalsIgnoreCase("cat")){
                countCat++;
            }
        }
        boolean result = countDog==countCat;

        System.out.println(result);


    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true


s7":;rLw7!Q'nia    jetbrains şifre
 */