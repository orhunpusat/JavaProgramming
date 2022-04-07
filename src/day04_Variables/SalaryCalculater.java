package day04_Variables;

import org.w3c.dom.ls.LSOutput;

public class SalaryCalculater {
    public static void main(String[] args) {
        // hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }




}
