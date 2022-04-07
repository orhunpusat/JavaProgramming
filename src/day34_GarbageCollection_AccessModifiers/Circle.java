package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name ;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius = radius;
        // pi = 3.14; static variables not constructer
    }

    static{
        //radius = 5; not static variable, instance variable
        pi = 3.14;
        name = "Circle;";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

     /*
    public static void main(String[] args) { //if we use main method veriables dont use other class

        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

      */
    }
    }





