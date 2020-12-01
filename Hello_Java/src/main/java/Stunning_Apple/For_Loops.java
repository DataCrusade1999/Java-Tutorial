package Stunning_Apple;

import java.util.Arrays;

public class For_Loops {
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8,9};

        Arrays.stream(array).forEach(System.out::println);
        

        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
            System.out.println(" ");
        }
        System.out.println("Enhanced for loop");
        for(int number:array)
        {
            System.out.println(number);
        }

        System.out.println("Enhanced for loop on String Array");

        String names[] = {"Ashutosh","Pandey"};
        for(String name : names)
        {
            System.out.println(name);
        }
        Arrays.stream(names).forEach(System.out::println);
    }
    
}
