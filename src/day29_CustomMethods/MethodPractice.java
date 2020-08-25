package day29_CustomMethods;
    /*
	1. create a method that can print odd numbers between 1~100 in a same line seperated by space
	2. create a method that can print even numbers between 0~100
     */


public class MethodPractice {
    public static void main(String[] args) {
        oddNumber();
        System.out.println("Hello");
        evenNumber();
    }

// task1:
    public static void oddNumber(){

        for (int i = 1; i <=100 ; i+=2) {

            System.out.print(i+" ");

        }
        System.out.println();
    }

    //task2:
    public static void evenNumber(){

        for (int i=2; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    }

