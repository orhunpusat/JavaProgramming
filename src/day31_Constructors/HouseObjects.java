package day31_Constructors;

public class HouseObjects {
    public static void main(String[] args) {

        House house1 = new House("Camlık",3,5,2,2,3,40000);
        House house2 = new House("Mehmetcik",1,2,1,1,1,20000);

        house1.price = 22000;
        house2.price = 44000;

        System.out.println(house1);
        System.out.println(house2);
    }
}
