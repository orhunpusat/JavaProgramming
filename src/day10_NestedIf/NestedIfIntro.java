package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;

        if(score>=0 && score<=100){
            if(score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        System.out.println("--------------------------------------");

        int age = 25;
        boolean hasId = true;


        if (hasId){//if the person has ID
            if(age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }

        }else{
            System.out.println("You must have ID to buy alcohol");
        }
        System.out.println("----------------------------------------");

        int num = 5;

        if(num>=1 && num<=7){
            if (num==1){
                System.out.println("Monday");
            }else if(num==2){
                System.out.println("Tuesday");
            }else if(num==3){
                System.out.println("Wednesday");
            }else if(num==4){
                System.out.println("Thursday");
            }else if(num==5){
                System.out.println("Friday");
            }else if(num==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else{
            System.out.println("Invalid Number");
        }



    }
}
