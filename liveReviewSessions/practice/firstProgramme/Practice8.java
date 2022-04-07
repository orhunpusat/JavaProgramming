package practice.firstProgramme;

public class Practice8 {
    public static void main(String[] args) {
        int age = 14;
        String citizen = "USA";
        boolean isEligible = age>=21 && citizen=="USA";
        if (isEligible){
            System.out.println("isEligible = ");
        }else if (!isEligible){
            System.out.println("is not eligible = ");
        }

        int year = 2001;
        boolean leapyear = year % 4 == 0;
        System.out.println(year +" is leapyear :" + leapyear);



    }
}
