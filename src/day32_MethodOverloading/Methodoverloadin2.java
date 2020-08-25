package day32_MethodOverloading;

public class Methodoverloadin2 {

    public static void main(String[] args) {
        addition2Numbers(2,3);
        addition3Number(10,20,30);
        addition4Number(10,20,30,40);
        System.out.println("==================================================================");

        addition(2,3);
        addition(3,4,5);
        addition(2,3,1,6);

    }


    public static void addition2Numbers(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition3Number(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition4Number(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);

    }
//=========================================================================

    public static  void addition(double a, double b){
        System.out.println(a+b);
    }
    public static void addition(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);

    }




}