package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Mehmet",34,'M',112,"Java Developer",125000);

        Tester tester = new Tester("Ali",22,'M',124,"SDET",110000);

        Teacher teacher = new Teacher("Mert",23,'M',134,"Math Teacher",100000);

        Student student = new Student("Mete",24,'M',234,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("-----------------------------------------------------------------");

    }
}
