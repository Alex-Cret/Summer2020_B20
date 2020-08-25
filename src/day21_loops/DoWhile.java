package day21_loops;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class DoWhile {

    public static void main(String[] args) {

        boolean result = false;
        while (result) {
            System.out.println("Hello World");
        }
        System.out.println("================================");
        do { // just do it
            System.out.println("Hello World");
        }while(result);

    }

}
