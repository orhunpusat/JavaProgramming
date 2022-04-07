package practice.firstProgramme;

public class Practice18 {
    public static void main(String[] args) {

        int number =11 ;
        boolean has28Days = number==2;
        boolean has30Days = number==4 ||number== 6 || number== 9 ||number==11;
        boolean has31Days = number==1 ||number== 5 || number== 3 ||number==7||number==8||number==10||
                            number==12;
        String result = "";


        if (has28Days){
            System.out.println("28 Days");
        }else if (has30Days){
            System.out.println("30 Days");
        }else if(has31Days){
            System.out.println("31 Days");
        }else{
            System.out.println("Invalid Number");
        }
        if (number >= 1 && number <= 12) {


            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "Oktober";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }

        }else{
            result = "İnvalid Number";
        }
        System.out.println(result);


        }
    }



















