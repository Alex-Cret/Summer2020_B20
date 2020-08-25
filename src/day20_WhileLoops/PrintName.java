package day20_WhileLoops;

public class PrintName {

    public static void main(String[] args) {

        String name="Alex";
int num=10;
        while (num<15){
            System.out.println(name);
            num++;
        }
        System.out.println(num);


        System.out.println("=============================================");

        String str="Cyberteck";
        String reversed="";
        int l=str.length()-1;
        while (l>=0){
            reversed+=str.charAt(l);
            l--;
        }
        System.out.println(reversed);
    }
}
