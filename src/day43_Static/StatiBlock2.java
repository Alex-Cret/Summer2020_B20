package day43_Static;

import day41_Static.Tester;

public class StatiBlock2 {

    static int a;
    static String b;
    static Tester tester1;

    // static ExcelSheet excel;

    static {
        tester1=new Tester();
        tester1.setInfo("Muhtar",150000,"m",34);
        a=100;
        b="Cybertek";
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
