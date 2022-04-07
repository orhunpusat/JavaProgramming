package week02;

import java.sql.SQLOutput;

public class EmloyeeInfo {
    public static void main(String[] args) {
        /*
         * name
         * companyName
         * jobTitle
         * gender : char
         * salary : double
         * employeeID : int
         * hasBenefits(Y/N) : boolean true/false
         * isMarried : char Y/N
         */
        String name = "Mevlut";
        String companyName = "Cydeo";
        String jobTitle = "QA";
        char gender = 'M';
        int employeeId = 1555;
        boolean hasBenefits = true;
        char isMarried = 'N';
        System.out.println(name);
        System.out.println(companyName);
        System.out.println(jobTitle);
        System.out.println(gender);
        System.out.println(employeeId);
        System.out.println(hasBenefits);
        System.out.println(isMarried);

    }




}
