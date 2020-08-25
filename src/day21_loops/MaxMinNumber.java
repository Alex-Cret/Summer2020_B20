package day21_loops;

import java.util.Scanner;

//write a program that asks user to enter 5 number an returns maximum
public class MaxMinNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int max=-2147483648;
int min =2147483647;
        for (int i=1; i<=5; i++){
            System.out.println("Enter a number: ");
            int num=scan.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);


    }
}
