package day16_ForLoopStringPractice;

public class Task4 {
    public static void main(String[] args) {


        String str = "Java Java";
        int count = 0;

        for (int i = 0; i <=str.length()-4 ; i++) {
            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println(count);

    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
