package Stunning_Apple;

public class Switch_Case {
    public static void main(String[] args) {
        String genString = "female";
        switch (genString.toLowerCase()) {
            case "male":
            System.out.println("I am a male");
            break;

            case "female":
            System.out.println("I am a Female");
            break;

            case "prefer not to say":
            System.out.println("Prefer not to say");
            break;
        
            default:
            System.out.println("Sorry we are out of options");
            break;
        }
    }
    
}
