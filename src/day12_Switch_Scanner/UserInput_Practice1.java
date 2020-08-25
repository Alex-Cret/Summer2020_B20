package day12_Switch_Scanner;


import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your number");

        int num = input.nextInt();


      String result=  (num%2==0)? num+" Your number is Even " : num+" Your number is Odd ";
        System.out.println(result);

    }

}
