package practice.firstProgramme;

public class Practice13 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = b;
        b=a;
        a=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
