package day18_ForLoop;
/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
 */

import java.util.Scanner;

public class eMailDomain {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String email=input.next();

        int index1=email.indexOf("@");
        int index2=email.lastIndexOf(".");
        System.out.println(index1);
        System.out.println(index2);

        String domain=email.substring(index1+1,index2);
        System.out.println(domain);
    }

}
