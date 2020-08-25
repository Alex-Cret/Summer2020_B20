package day18_ForLoop;
/*
 write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();

      String s1=  str.substring(1); //"ava"

        String s2=str.substring(0,1);//"J"
        String result1=s1+s2;
        System.out.println(result1);

    }


}
