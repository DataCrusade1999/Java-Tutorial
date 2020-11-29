package Stunning_Apple;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class import_and_package {

    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(date);
        System.out.println(localdatetime);
        
    }
    
}
