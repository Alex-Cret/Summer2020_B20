package day29_CustomMethods;
/*
step1: print hello 5 times
step2: print your school 5 times
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
 */

public class methodWithoutParameter2 {

    /*
    Access-Modifier Specifers return-type name()
     */

    public static void main(String[] args) {
        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Alex");
        printHello5X();
    }

    public static void printHello5X(){


        for (int i = 0; i <5 ; i++) {

            System.out.println("hello");
        }

    }

}
