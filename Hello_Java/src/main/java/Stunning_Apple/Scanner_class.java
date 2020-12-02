package Stunning_Apple;
import java.time.LocalDate;
import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("What is your name?");
            String username = scanner.nextLine();
            System.out.println("Hello " + username);
    
            System.out.println("How Old Are You?");
            int age = scanner.nextInt();
            int year = LocalDate.now().minusYears(age).getYear();
            System.out.println("You are " + age + " years old and you were born in " + year);

            if (age<18) {
                System.out.println(username + " is not an adult");
                
            } else {
                System.out.println(username + " is an adult");
                
            }


        }
        finally {
            scanner.close();

        }
        

    }
    
}
