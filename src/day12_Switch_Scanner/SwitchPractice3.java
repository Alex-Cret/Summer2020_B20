package day12_Switch_Scanner;

public class SwitchPractice3 {


    public static void main(String[] args) {

        String productName="iphone";

        switch (productName){

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "iPad":
            case"MacBook":
                System.out.println("Apple");
                break;

        }



    }




}


