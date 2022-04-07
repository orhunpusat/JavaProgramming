package day37_Inheritance.phoneTask;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a Face Time with phone number"+phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand+" "+model+" is having a Face Time with email"+email);
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
                    faceTime(String email)
					toString()
 */
