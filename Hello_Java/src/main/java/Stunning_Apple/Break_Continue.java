package Stunning_Apple;

public class Break_Continue
{
    public static void main(String[] args)
    {
        String names[] = {"Ashutosh","Ppandey","Ashutosh","pandey"};
        for (String string : names) 
        {
            if (string.equals("pandey"))
            {
                break;  
            }
            System.out.println(string);
        }

        System.out.println("usage of continue keyword");

        for (String string2 : names)
        {
            if (string2.startsWith("Ppandey"))
            {
                continue;
                
            }
            System.out.println(string2);
        }
            
    }
    }
    

