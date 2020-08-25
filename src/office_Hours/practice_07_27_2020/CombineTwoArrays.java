package office_Hours.practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        char[] a1={'A','B','C','D'};
        char[] a2={'D','E','F'};

        char[] a3= new char[a1.length+a2.length];
        int j=0;
for (char each:a1){

    a3[j]=each;
    j++;
}

        for (char each:a2) {
            a3[j]=each;
            j++;
        }

        System.out.println(Arrays.toString(a3));

    }

}
