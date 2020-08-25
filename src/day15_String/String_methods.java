package day15_String;

public class String_methods {

    public static void main(String arr[]) {

        String name="Cybertek School is a great place";
        //           01234567
        // charAt(index)
        char ch1=name.charAt(0); //'C'
        char ch2=name.charAt(5); // 't'

        System.out.println(ch1);
        System.out.println(ch2);

        // lenght() ==> int return number of characters
        int l= name.length();
        System.out.println(l);
        int lastIndexNumber=name.length()-1; // last character in string
        System.out.println(lastIndexNumber);
        char lastChar=name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        // concat(str):
        String schoolName="Cybertek";
        schoolName=schoolName.concat(" School"); // "Cybertek School"

        System.out.println(schoolName);

        String r1="Cybertek"+123+'A'+true;
        System.out.println(r1);

        String r2="Cybertek".concat("123");
        System.out.println(r2);

        // toLowerCase():
        String name1="CYBERTEK SCHOOL";
        name1=name1.toLowerCase();//"cybertek school"

        System.out.println(name1);

        //toUpperCase():
        String name2="alex";
        name2=name2.toUpperCase();  //"ALEX"
        System.out.println(name2);

        // trim():

        String p=" ";
        p=p.trim();// "Cybertek School"
        boolean a=p.isEmpty();
        System.out.println(a);

        String ta="A ";
        ta=ta.concat("B ");
        String tb="C";
        ta=ta+tb;
        ta.replace('c','D');
        ta=ta+tb;
        System.out.println(ta);
String str="Hello World";
int z=str.indexOf(" ");
        System.out.println(z);

        String str1="Batch20";
        int Z=str1.trim().length();
        System.out.println(Z);


    }

}
