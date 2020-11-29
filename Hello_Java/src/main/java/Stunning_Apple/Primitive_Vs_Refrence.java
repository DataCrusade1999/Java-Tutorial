package Stunning_Apple;

public class Primitive_Vs_Refrence {

    public static void main(String[] args) {
        int a=10;
        int b=a;
        a=100;
        System.out.printf("a is %d and b is %d\n", a, b);
        Person alex /* <- This is the Refrence */ = new Person("alex"); //<- This is the object
        Person mariam = alex;
        System.out.println("Before changing alex");
        System.out.println(alex.name + " " + mariam.name);
        mariam.name = "Cassidy"; 
        System.out.println("After changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }
    static class Person{
         String name;
         Person(String name){
             this.name = name;
         }
    }
    
}
