package practice.firstProgramme;

public class Practice22 {
    public static void main(String[] args) {

        int score= 150;
        if(score>=0&&score<=100){
            if(score>=90){
                System.out.println("exellant");
            }else if (score>=80){
                System.out.println("great");
            }else if(score>=70){
                System.out.println("good");
            }else if (score>=60){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }
        }else{
            System.out.println("invalid number");
        }
        System.out.println("---------------------------");


            String result =(score >= 0 && score <= 100)?(score>=90)?"exellent":(score>=80)?"great":(score>=70)?"good":(score>=60)?"passed"
                    :"failed":"invalid number";


        System.out.println(result);
    }
}
