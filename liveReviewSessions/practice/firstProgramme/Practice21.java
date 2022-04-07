package practice.firstProgramme;

public class Practice21 {
    public static void main(String[] args) {
        int number = 0;
        String result= "";
        if(number> 0){
            result="Positive";
        }else if(number<0){
            result="Negative";
        }else{
            result="Zero";
        }
        System.out.println(result);

        System.out.println("----------------------------");

        int n= 65;
        boolean isDivisibleBy2=n%2==0;
        boolean isDivisibleBy3=n%3==0;
        boolean isDivisibleBy5=n%5==0;

        System.out.println(n +" is divisible by 2 :"+isDivisibleBy2);
        System.out.println(n +" is divisible by 3 :"+isDivisibleBy3);
        System.out.println(n +" is divisible by 5 :"+isDivisibleBy5);
    }

}
