package day07_Unary_ShortHand;

public class Unary {

    public static void main(String[] args) {
        System.out.println(-1+-10);
        System.out.println(-11- -10);



        int a=20;
        --a; //19
                //a=a-1 ==--a; decrement

        int b=10;
      ++b; //11
                // b=b+1=++a increment

        System.out.println(a);
        System.out.println(b);

        int x=100;
        System.out.println(++x); //101

        int y=200;
        System.out.println(--y);//199

        int z=80;

        System.out.println(++z);
        System.out.println(--z);

        int s=10;
        System.out.println(s++);
    }
}
