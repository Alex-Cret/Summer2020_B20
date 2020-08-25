package day08_LogicalOperators;

public class PostAndPre {

    public static void main(String[] args) {
        int a=200; //
        int b=-a++ + - --a*a-- %2;
        //  b= -200-200*200%2

        System.out.println(b);
    }


}
