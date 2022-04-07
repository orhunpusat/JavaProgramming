package practice.firstProgramme;

public class Practice9 {
    public static void main(String[] args) {

        int year= 1983;

        boolean leapyear = year % 4 ==0;
        System.out.println( year+" is year"+" leapyear = " + leapyear);

        System.out.println("---------------------------------------------");
        int num= 150 ;
        boolean isPositive = num>0;
        boolean isNegative = num<0;
        boolean isZero = num==0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("isZero = " + isZero);
        
    }
}
