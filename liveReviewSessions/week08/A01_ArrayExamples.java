package week08;

import java.util.Arrays;

public class A01_ArrayExamples {
    public static void main(String[] args) {
        // declare and initialize an Array

        int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type
        System.out.println(Arrays.toString(codes)); // how we print an array

        codes[0]=200; // first element
        codes[1]=201; // second element
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200,201,204,400,401,403,404,500}; // another way of declaring and initializing

        System.out.println("-----------size of an array---------");

        // String str = "Java" ;  str.length()----> size of the string

        // for arrays, lentgh gets no parameter and returs an integer
        System.out.println("the size of our array: "+statusCodes.length);

        int sizeOfArrays = statusCodes.length; // 8, use it for creating loops

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};

        for (int i = 0; i < sizeOfArrays ; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code means = " + text);

        }


    }
}
 /*
 Week8:  2h+4.5h+4.5h = 11 hours Java
        Soft Skills: Experience Sharing (2+2) 4 hours
        15/5=3hours recording
Week9: 2+2+4h= 8 hours Java
Week10: 13 hours just JAVA = 2.5 hours everday

Arrays: int code = 200; // single data

DATA Structures: popular one is Array
- ArrayList, List, Set, Map ....

In Java, Arrays are fixed size, not re-sizable

Arrays hold same type of Data
// declare and initialize an Array

        int code = 200;

        int[] codes = new int[8]; // my codes array holds 8 elements, they are all int type
        System.out.println(Arrays.toString(codes)); // how we print an array

        codes[0]=200; // first element
        codes[1]=201; // second element
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200,201,204,400,401,403,404,500}; // another way of declaring and initializing

        System.out.println("-----------size of an array---------");

        // String str = "Java" ;  str.length()----> size of the string

        // for arrays, lentgh gets no parameter and returs an integer
        System.out.println("the size of our array: "+statusCodes.length);

        int sizeOfArray = statusCodes.length; // 8, use it for creating loops

        String[] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};
  */