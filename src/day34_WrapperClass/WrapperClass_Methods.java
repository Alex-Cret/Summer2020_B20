package day34_WrapperClass;

public class WrapperClass_Methods {

    public static void main(String[] args) {

        String str="123";

        int a=Integer.parseInt(str);

        System.out.println(a+1);//124
        System.out.println(str+1); //1231


        double d1=Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s1="TRUE";

       boolean b= Boolean.parseBoolean(s1);
        System.out.println(b);


        String s2="10000.5";
        double d2=Double.valueOf(s2); // unboxing

        System.out.println(d2*2);

        String s3="FalSe";

        boolean r2=Boolean.valueOf(s3); // unboxing
        System.out.println(r2);

    }

}
