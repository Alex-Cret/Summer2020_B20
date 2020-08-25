package office_Hours.practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str=input.nextLine();
        //          0123456

        for(int i=str.length()-1;i>=0;i-=1){
            char ch=str.charAt(i);
            System.out.print(ch+"");
        }
        System.out.println();
        System.out.println("========================");
        String result2="";
        int l=str.length()-1;
        while(l>=0){
            result2+=str.charAt(l);
                    l--;
        }
        System.out.println(result2);

    }
}
