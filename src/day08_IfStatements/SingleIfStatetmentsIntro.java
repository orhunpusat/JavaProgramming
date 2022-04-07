package day08_IfStatements;

public class SingleIfStatetmentsIntro {
    public static void main(String[] args) {
        int number = 301;
        boolean evenNumber = number%2 ==0;
        boolean oddNumber = !evenNumber; //not even number

        if(evenNumber){
            System.out.println(number + " is even number");
        }

        if(oddNumber){
            System.out.println(number + " is odd number");
        }
        System.out.println("------------------------------------------");

        int n = 200;

        //positive
        if(n>0){
            System.out.println(n +" positive");
        }
        //negative
        if(n<0){
            System.out.println(n + " negative");
        }
        //zero
        if(n==0){
            System.out.println(n + " zero");
        }



    }
}
