package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 20;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        //eligible
        if (isEligible) { //true
            System.out.println("Eligible");
        }
        //not eligible
        if (!isEligible){ // !true ==> not true ==> false
            System.out.println("Not Eligible");
        }


    }
}