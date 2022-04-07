package practice.firstProgramme;

public class Practice12 {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 30;
        double stateTaxRate = 5.5;
        double federalTaxRate = 18.1;

        int salaryBeforeTax = hourlyRate *weeklyHours * 52;
        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double federalTax = salaryBeforeTax*federalTaxRate/100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax =salaryBeforeTax - totalTax;

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
