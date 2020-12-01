package Stunning_Apple;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int  array[]={2,3,4};
        System.out.println(Arrays.toString(array)); 
        int array_sec[]=new int [3];
        array_sec[0]=90;
        array_sec[1]=30;
        array_sec[2]=900;
        System.out.println(Arrays.toString(array_sec));
        System.out.println("The size of the array is "+array_sec.length);
        boolean array_b[]={true,false};
        System.out.println(Arrays.toString(array_b));
        boolean array_c[]=new boolean [3];
        System.out.println(Arrays.toString(array_c));
        String array_s[]=new String [3];
        System.out.println(Arrays.toString(array_s));
        String array_st[]={"Ashutosh","Pandey"};
        System.out.println(Arrays.toString(array_st));
        int ninety = array_sec[array_sec.length-1];
        System.out.println(ninety);
    }
     
}
