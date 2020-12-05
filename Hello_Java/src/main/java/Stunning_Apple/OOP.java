package Stunning_Apple;

public class OOP {
    public static void main(String[] args) {
        char letters[] = {'A','A','B','C','D','D','D'};
        int count = countOccurence(letters,'A');

        System.out.println(count);
    }
    public static int countOccurence(char letters[],char searchLetter) {
        int count = 0;
       for (char letter : letters) {
           if(letter == searchLetter)
           {
               count++;

           }
           
       }
        return count;
        
    } 

    
}