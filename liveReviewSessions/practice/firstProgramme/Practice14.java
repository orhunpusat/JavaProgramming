package practice.firstProgramme;

public class Practice14 {
    public static void main(String[] args) {

        int a = 100,
                b = 200,
                c = 300;

        boolean aisMedian = (a>b && a<c) || (a<b && a>c);
        boolean bisMedian = (b>a && b<c) || (b<a && b>c);
        boolean cisMedian = !aisMedian && !bisMedian;
        System.out.println("aisMedian = " + aisMedian);
        System.out.println("bisMedian = " + bisMedian);
        System.out.println("cisMedian = " + cisMedian);

    }



}
