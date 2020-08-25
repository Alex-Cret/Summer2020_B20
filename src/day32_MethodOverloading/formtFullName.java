package day32_MethodOverloading;

import java.util.Scanner;

public class formtFullName {
    // // formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String first=input.nextLine();
        String last =input.nextLine();

       String fullName=formatFullName(first,last);
        System.out.println(first);
    }

public static String formatFullName(String first, String last ){
    first= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
    last=last.substring(0,1)+last.substring(1).toLowerCase();
    String fullName=first+" "+last;

        return fullName;
}
}
