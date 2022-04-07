package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int s =51;

        if(s>=0 && s<=100){
            if(s>=90){
                System.out.println("Exellant");
            }else if (s>=80){
                System.out.println("Great");
            }else if (s>=70){
                System.out.println("Good");
            }else if (s>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }

        System.out.println("--------------------------------------------------------");

        //solutuin2
        String result=(s>=0 && s<=100)? (s>=90)?"Exellant":(s>=80)?"Great":(s>=70)?"Good":(s>=60)?"Passed"
                :"Failed" :"Invalid Score";
        System.out.println(result);

        System.out.println("-----------------------------------------------------");

        //solutuion3:
        String result2= "";

        if(s>=0 && s<=100){
            result2 =(s>=90)?"Exellant":(s>=80)?"Great":(s>=70)?"Good":(s>=60)?"Passed" :"Failed";

        }else{
            System.out.println("Invalid Score");
        }
        System.out.println(result2);
    }
}
