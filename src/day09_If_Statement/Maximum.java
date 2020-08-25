package day09_If_Statement;

public class Maximum {
    /*
    write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
     */

    public static void main(String[] args) {
        double a=500;
        double b=200;
        double c=1000;

        boolean aIsMax=a>b && a>c;

        boolean bIsMax= aIsMax==false && b>c;
                //b>a && b>c;
        boolean cIsMax=aIsMax==false && bIsMax==false;
                //!aIsMax && !bIsMax;
                //!(aIsMax && bIsMax);
                //c>b && c>a
        double max=0;

        if(aIsMax){
            //System.out.println(a);
        max=a;
        }
        if(bIsMax){
           // System.out.println(b);
            max=b;
        }
        if (cIsMax){
            max=c;
            //System.out.println(c);
        }
        System.out.println(max+" is maximum number");
    }
}
