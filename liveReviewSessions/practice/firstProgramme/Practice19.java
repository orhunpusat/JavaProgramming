package practice.firstProgramme;

public class Practice19 {
    public static void main(String[] args) {
        int number = 8;
        String result = "";
        if (number >= 1 && number <= 12) {
            if (number == 1) {
               result= "Jan";
            } else if (number == 2) {
               result= "Feb";
            } else if (number == 3) {
                result= "Marc";
            } else if (number == 4) {
                result= "Apr";
            } else if (number == 5) {
                result= "May";
            } else if (number == 6) {
                result= "Jun";
            } else if (number == 7) {
                result= "July";
            } else if (number == 9) {
                result= "Sep";
            } else if (number == 10) {
                result= "Oct";
            } else if (number == 11) {
                result= "Nov";
            } else {
                result= "Dec";
            }

        }else{
            result= "Invalid Number";
        }
        System.out.println(result);
    }
}
