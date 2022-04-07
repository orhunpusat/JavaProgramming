package day11_Switch_Scanner;

public class NumberOfMonths {
    public static void main(String[] args) {
        int year = 2020;
        int number = 2;

        if(number>=1 && number<=12){

            switch (number){
                case 2:
                    if(year % 4 ==0) {
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default://1,3,5,7,8,12
                    System.out.println("31 days");
            }

        }else{
            System.out.println("Invalid Number");
        }
    }
}
