package practice.firstProgramme;

public class Practice10 {
    public static void main(String[] args) {

        String name = "zuhtu";
        int age = 25;
        String citizen = "TR";

        boolean isEligible = age>18 && citizen == "TR";
        System.out.println(name+" is eligible to vote = " + isEligible);

        System.out.println("------------------------------------------------");
        String name1 = "Saban";
        int score = 830;
        int age1 = 23;
        int income = 50000;

        boolean isEligible1 = score>=800 && income>=49000;
        System.out.println(name1+ " is eligible for loan = " + isEligible1);

    }
}
