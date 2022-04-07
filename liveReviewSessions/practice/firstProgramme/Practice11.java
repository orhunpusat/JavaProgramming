package practice.firstProgramme;

public class Practice11 {
    public static void main(String[] args) {
        int month = 2;
        boolean has28Days = month ==2;
        boolean has30Days = month==4 ||month==6||month==9||month==11;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days){
            System.out.println("28Days ");
        }
        if (has30Days){
            System.out.println("30Days ");
        }
        if (has31Days){
            System.out.println("31Days ");
        }
    }
}
