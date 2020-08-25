package day30_CustomMethods;

import library.Util;

public class MethodCalls {

    public static void main(String[] args) {
        String str = "aaaabbbbbbbbcccccccccc";
        String str2 = Util.removeDup(str);

        System.out.println(str2);

    }
}