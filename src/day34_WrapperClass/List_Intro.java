package day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList <Integer> scores= new ArrayList<Integer>();

        scores.add(95); // autoBoxing     0
        scores.add(100);   //             2
        scores.add(85);         //        3
        scores.add(75);       //          4
        scores.add(1,60); //  1
        System.out.println(scores);
//100
        System.out.println(scores.get(2));


    }
}
