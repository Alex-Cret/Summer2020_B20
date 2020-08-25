package SelfPractice.forloop;

import java.util.Scanner;

public class Print_Range {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

if(start>=65 && end<=90){
    for(char ch=start; ch<=end; ch++){
        System.out.print(ch+"");
    }
}
        if(start>=97 && end<=122){
            for(char ch=start; ch<=end; ch++){
                System.out.print(ch+"");
            }
        }

    }
}
