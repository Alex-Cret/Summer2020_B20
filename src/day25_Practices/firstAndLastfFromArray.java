package day25_Practices;

import java.util.Arrays;
public class firstAndLastfFromArray {
public static void main(String[] args){




    String [] words = {"hello","why","by","apple","note"};
    String[] firstAndLast= new String [words.length];
    int index = 0;

        for (String each:words){
        firstAndLast[index]=(""+each.charAt(0)+each.charAt(each.length()-1));
        index++;
    }
        System.out.println(Arrays.toString(firstAndLast));
}
  }