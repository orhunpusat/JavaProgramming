package practice.day11;

public class coffeeMatic {
    public static void main(String[] args) {
        String size = "Chocalate";
        double price = 0.0;
        int calories= 0;
        double givenmoney= 50.0;


        switch (size){
            case "Turkish Coffee":
                price = 2.50;
                calories = 40;
                break;
            case "Chocalate":
                price = 3.50;
                calories = 100;
                break;
            case "Nescafe":
                price = 3.00;
                calories = 55;
                break;
            default:
                System.err.println("Invalid Size"+ size);
        }
        if(price !=0){
            System.out.println("size = " + size);
            System.out.println("calories = " + calories);
            System.out.println("givenmoney = " + givenmoney);
            System.out.println("change = " + (givenmoney-price));
        }
    }
}
