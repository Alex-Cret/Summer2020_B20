package day20_WhileLoops;
/*
 Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double result=1;

    for (int i=scan.nextInt(); i>=1;i--){

        result*=i;
    }
        System.out.println(result);

    }

}
