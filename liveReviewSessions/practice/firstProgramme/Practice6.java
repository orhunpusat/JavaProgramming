package practice.firstProgramme;

public class Practice6 {
    public static void main(String[] args) {
        int hourlyRate = 30;
        int weeklyHours= 45;
        double stateTax = 18.1;
        double federalTax = 5.5;

        int salaryBeforeTax = hourlyRate*weeklyHours*52;
        double totalstateTax = salaryBeforeTax*stateTax/100;
        double totalFederalTax = salaryBeforeTax*federalTax/100;
        double salary = salaryBeforeTax-(totalFederalTax+totalstateTax);

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("totalstateTax = " + totalstateTax);
        System.out.println("totalFederalTax = " + totalFederalTax);
        System.out.println("salary = " + salary);
        }

    }

