package office_Hours.practice_07_08_2020;
/*
Write a program that can return the shortest string of text from a String array
 */
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2147483648;

        for(int i=1;i<=5;i++){
            System.out.println("Enter a number:");
            int n=input.nextInt();
            if(n>max){
               max=n;
            }
        } System.out.println(max);

    }
}
