package day38_Inheritance.carTask;

public class Bmw extends Car {

    public Bmw( String model, String color, int year, int miles, double price) {
        super("Bmw", model, color, year, miles, price);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }

}

/*
2. BMW:
		extra methods:
						breaksDown()
						racing()
 */
