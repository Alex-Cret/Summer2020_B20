package day42_Static;


class Test{
    int a=10;
    static int b;
}

public class StaticVariable {

    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.a=5;
        Test obj2=new Test();
        obj2.a=10;
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
