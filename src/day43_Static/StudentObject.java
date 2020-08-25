package day43_Static;

public class StudentObject {

    public static void main(String[] args) {

        CybertekStudent obj1=new CybertekStudent();
        obj1.name="Ivan";

        CybertekStudent obj2=new CybertekStudent();
        obj2.name="Cristina";

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        System.out.println(obj1.schoolname);
        System.out.println(obj2.schoolname);

    }

}
