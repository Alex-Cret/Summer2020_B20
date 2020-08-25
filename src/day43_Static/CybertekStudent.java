package day43_Static;

class A{
    static int a=200;
}

public class CybertekStudent {
    // for the adventages of static

    String name;
    int age;
    char gender;
    String location;
    static  String schoolname="Cybertek School";

    public void getInfo(){
        System.out.println("Name: "+name);
    }

    public void  printSchoolName(){
        System.out.println("School Name: "+schoolname);
    }
}
