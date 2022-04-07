package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");
    }


    static{ //runs before anything, and only runs one time
        System.out.println("Static Block1");
    }

    static{
        System.out.println("Static Block2");
    }

    static{
        System.out.println("Static Block3");
    }
}
