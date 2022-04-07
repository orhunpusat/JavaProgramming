package practice.day11;

public class Elevator {
    public static void main(String[] args) {
        int floorNum= 2;
        String floorNum1 = "Lobby, Verizon, Starbucks";
        String floorNum2 = "Cybertek, NASA, Intelsat";
        String floorNum3 = "Lyft, BofA, Stake house";
        if(floorNum==1){
            System.out.println(floorNum1);
        }else if(floorNum==2){
            System.out.println(floorNum2);
        }else if (floorNum==3) {
            System.out.println(floorNum3);
        }else{
            System.out.println("Invalid floor "+floorNum);
        }
        System.out.println("-------------------------------------------");

        switch (floorNum){
            case 1:
                System.out.println(floorNum1);
                break;
            case 2:
                System.out.println(floorNum2);
                break;
            case 3:
                System.out.println(floorNum3);
                break;
            default:
                System.out.println("Invalid floor "+ floorNum);
        }
    }
}
/*
Create a class called Elevator. A variable named floorNumber is given,
write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */