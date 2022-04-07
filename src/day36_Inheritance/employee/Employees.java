package day36_Inheritance.employee;

public class Employees {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Erol","Tester","Cydeo",'M',49,112,110000);
        tester.work();
        tester.test();
        System.out.println(tester);

        Developer developer=new Developer();
        developer.setInfo("Mike","Developer","Apple",'M',43,342,130000);
        developer.work();
        developer.writeCode();
        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Daniel","Driver","UPS",'M',57,567,80000);
        driver.work();
        driver.drive();
        System.out.println(driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Pamela","Teacher","Kids School",'F',33,890,90000);
        teacher.work();
        teacher.teach();
        System.out.println(teacher);
    }
}
