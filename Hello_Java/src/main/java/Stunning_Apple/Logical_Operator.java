package Stunning_Apple;

public class Logical_Operator {
    public static void main(String[] args) {
        boolean isAdult=false;
        boolean isStudent=true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isStudent );
        System.out.println((isAdult || !isStudent) && isStudent );
    }
    
}
