package day14_Recap;
import java.util.Scanner;
public class ScannerMehods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
byte b1=input.nextByte();
        byte b2=input.nextByte();
        byte b3=input.nextByte();

        int max=(b3>b2)?b3+2:(b2>b1)?b2-4:b1*-1;
        System.out.println(max);
        System.out.println("\"good\"");

}}
