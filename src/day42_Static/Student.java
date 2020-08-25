package day42_Static;

public class Student {

    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName="Cybertek Scool";
    static String favoriteTeacher="Muhtar";
    public void setInfo(String name,int age,int groupNumber,char gender){
        this.name=name;
        this.age=age;
        this.groupNumber=groupNumber;
        this.gender=gender;
    }
    public String toString(){
        return "School Nam: e"+schoolName+"\n Student Name: "+name;
    }

}
