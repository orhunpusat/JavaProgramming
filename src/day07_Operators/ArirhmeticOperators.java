package day07_Operators;

public class ArirhmeticOperators {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =3;

        int division = num1 / num2;//division veriable contains the result of num1 dividedby num2
        int remainder =num1 % num2;//remaide veriable contains the remainder of num1 dividedby num2

        //10 divided by 3 is equal to 3 with a remainder of 1
        System.out.println(num1+" divided by "+num2+" is equal to "+division+" with a remainder of "+remainder);

        /*
        remainder = numerator - (denominator * result)
                        10    - (    3       *    3) = 1
                        10 % 3 = 1
         */
        //what is the remainder of 25 divided 4 = 1
        System.out.println(25 % 4);

        //what is the remainder of 25 divided 5 = 0
        System.out.println(25 % 5);


    }
}
