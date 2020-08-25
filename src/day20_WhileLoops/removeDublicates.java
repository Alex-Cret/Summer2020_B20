package day20_WhileLoops;
/*
Write a program that can remove the duplicates from any given String:
Ex:
    input:abcabcaabb
    output:abc
 */

import java.util.Scanner;

public class removeDublicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str=input.nextLine();
        String result="";
        for(int i=0; i<=str.length()-1; i++ ){
          String s=""+str.charAt(i);

          if(result.contains(s)){           // if the character is allready contained in
                 continue;                   // result will skip it.

          }
            result+=s;
        }
        System.out.println(result);


    }
}
