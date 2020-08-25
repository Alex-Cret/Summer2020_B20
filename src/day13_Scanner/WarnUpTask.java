package day13_Scanner;

import java.util.Scanner;

public class WarnUpTask {

    /*
     1. write a progrm that can calculate the area of any given circle
                MUST use Scanner

    2. write a program that calculate the area of any given rectangle
                MUST use scanner
    3. write a program that can conver Kg to lb
                MUST use Scanner
    4. write a program that can convert gallons to litters

     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double R=input.nextDouble();
        double pi=3.14;
        double A=pi*R*R;
        System.out.println("Area o of your circle is: "+A);


        System.out.println("====================================================");

        System.out.println("Enter Length of rectangle : ");
        double l=input.nextDouble();

        System.out.println("Enter width of rectangle : ");
        double w=input.nextDouble();

        System.out.println("Area of your entered rectangle is:"+(l*w));



    }




}
