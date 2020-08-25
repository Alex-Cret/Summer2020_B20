package day12_Switch_Scanner;

public class BiggerNumber {

   /* write a program that checks for the bigger of 3 numbers.
    you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
    example:
    n1 = -2
    n2  = 2
    n3  = 1
    output: "n2 is bigger"
    NOTE: DO NOT USE IF STATEMENT

    */

    public static void main(String[] args) {

        int n1=-2;
        int n2=2;
        int n3=3;

        boolean r1=n1>n2 && n1>n3;
        boolean r2=n2>n1 && n2>n3;

        String result=(r1)? "n1 is bigger" :(r2)? "n2 is bigger":"n3 is bigger";
        System.out.println(result);

    }
}
