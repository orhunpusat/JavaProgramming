package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","Gray",2020,123456,20000);

        Tesla tesla = new Tesla("Model S","Red",2022,0,94990);

        BMW bmw = new BMW("X5","white",2020,2340,30000);


        toyota.start();
        tesla.start();
        bmw.start();
    }
}
