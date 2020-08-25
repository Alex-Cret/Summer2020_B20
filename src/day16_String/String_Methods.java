package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email="cybertek@gmail.com";
       email= email.replace("gmail","yahoo");
        System.out.println(email);

        String word="java";
        word=word.replace("a","e");
        System.out.println(word);

        String sentence="I like to learn Java, Java is cool, Java is fun";
       sentence= sentence.replace("a, Java","a, C#");


        sentence=sentence.replace("Java ","Python ");
        System.out.println(sentence);

        String s1="I like to stai in Cybertek, Cybertek is nice place";

        s1=s1.replace("Cybertek","MIT");
        System.out.println(s1);
        s1=s1.replace("MIT","Cybertek");
        System.out.println(s1);
        System.out.println();
        System.out.println("===========================================");

        String s3="I like to drink tea and tea";
        s3 = s3.replaceFirst("tea","cola");
        System.out.println(s3);
        System.out.println("==================================");
        // indexOf()
        String s5="I like to stay in Cybertek, we are learning Java";
        int r1=s5.indexOf("r");
        int r2=s5.indexOf("re");
        int r3=s5.indexOf("rn");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("=============================================");
//lastIndexOf()
        String  s6="Java is a programming language, and Java is fun";

        int I1=s6.lastIndexOf("J");
        int I2=s6.indexOf("J");
        System.out.println(I1);
        System.out.println(I2);
String s7="Java";
int a1=s7.indexOf("A");
        System.out.println(a1);



    }
}
