package SelfPractice.forloop;

import java.util.Scanner;

public class sumOfFiveNumbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sum=0;
       for(int i=1;i<=5;i++){
           System.out.println("Enter a number:");
           int num=input.nextInt();
           sum+=num;
       }
        System.out.println(sum);


    }
}
