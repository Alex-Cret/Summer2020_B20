package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=b; //c=15

        b=a;  // b=10
        a=c;  // a=10

        System.out.println(a);
        System.out.println(b);

        int a1=20;
        int b1=25;

        int c1=b1; //c=25

        b1=a1; //b=20
        a1=c1; //a=25
        System.out.println(a1);
        System.out.println(b1);

    }

}
