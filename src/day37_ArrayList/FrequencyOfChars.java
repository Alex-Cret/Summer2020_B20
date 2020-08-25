package day37_ArrayList;
/*
. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

 */

import library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {
String str="AAABBC";
        ArrayList<String> list=new ArrayList<>();
for (String each:str.split("")){
    list.add(each);

}
        System.out.println(list);
String nonDup= Util.removeDup(str);

        for (String each: nonDup.split("")) {
     int count=   Collections.frequency(list,each);
        System.out.print(each+count);
        }
    }

}
