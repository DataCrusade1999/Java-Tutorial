package Stunning_Apple;

public class Blueprint {
    public static void main(String[] args) {
        Table table1 = new Table(4,"Black","Circle");
        Table table2 = new Table(4,"Blue","Square");
        System.out.println();
        System.out.println("Color of the Table");
        System.out.println(" Table1 color is " + table1.color);
        System.out.println(" Table2 color is " + table2.color);
        System.out.println();
        System.out.println("Shape of the Table");
        System.out.println(" Shape of Table1 is " + table1.shape);
        System.out.println(" Shape of Table2 is " + table2.shape);
        System.out.println();
        System.out.println("Legs of the Table");
        System.out.println(" Leg of Table1 is " + table1.legs );
        System.out.println(" Leg of Table2 is " + table2.legs );
    }
    static class Table {
        int legs;
        String color;
        String shape;

        Table(int legs, String color, String shape) {
            this.color = color;
            this.legs = legs;
            this.shape = shape;
        }

    }
}
