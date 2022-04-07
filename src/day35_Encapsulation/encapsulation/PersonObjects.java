package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
        //p1.name = "Daniel"; intelij give complier error name is private
        //p1.age = 28; age is private

        //p1.name ="";
        //p1.age = 2000;

        p1.setName("Daniel");
        p1.setAge(28);

        //System.out.println(p1.name+" : "+ p1.age);
        System.out.println(p1.getName()+" : "+p1.getAge());


    }



}
