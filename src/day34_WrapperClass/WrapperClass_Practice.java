package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {

        int[] arr={1,2,3,4};

        Integer [] arr2={1,2,3,4};

        for (int  each:arr2){
            System.out.println(each);
        }
double[]arr3={1,2,3,4,5,6,7};
        Double[] arr4={1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        for (double each:arr4) {
            System.out.println(each);

        }
        char ch=79;
        Character ch2=79;

        System.out.println(ch2);

        String [] nums1={"12.2","13.3","14","15"};

        double[] nums2=new double[nums1.length];
        for ( int i=0; i<=nums1.length-1; i++){
         nums2[i]=  Double.parseDouble( nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));


    }
}
