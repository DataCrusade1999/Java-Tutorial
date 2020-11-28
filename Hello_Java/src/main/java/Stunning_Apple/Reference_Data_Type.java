package Stunning_Apple;

import java.time.LocalDate;

public class Reference_Data_Type {

    public static void main(String[] args) {
        String original;
        new String(original = "Ashutosh");
        System.out.println(original);
        System.out.println(original.length());
        System.out.println(original.toUpperCase());

        LocalDate Date = LocalDate.now();

        System.out.println(Date.getMonthValue());
        
    }
    
}
