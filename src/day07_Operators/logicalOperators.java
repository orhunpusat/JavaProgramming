package day07_Operators;

public class logicalOperators {
    public static void main(String[] args) {

        //logical AND: both or all
        boolean result1 = 10 > 5 && 10 > 7;
        //                  true && true
        System.out.println("result1 = " + result1); //true

        boolean result2 = 20 > 15 && 20 > 25;
        //                  true  && false
        System.out.println("result2 = " + result2);//false

        boolean result3 = 30 > 50 && 30 > 10;
        //                  false && true
        System.out.println("result3 = " + result3);// false
        System.out.println("--------------------------------------------");

        //Logical OR :
        /*boolean result4 = 100 == 200 !! 100 !=300;
                             //false   !! true
         System.out.println(result4); //True

         boolean result5 = 1000 > 900 !! 1000 < 2000;
                            true
         System.out.println(result5); //True

         boolean result6 = 7 < 0 !! 7 > 15;
                            false    false
         System.out.println(result6); //True
         */
        System.out.println("------------------------------------------");

        //Logical NOT :
        boolean result7 = !true; //false
        boolean result8 = !false; //true
        boolean result9 = !(100 == 200);
        //                !false ==>true
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);





    }
}
