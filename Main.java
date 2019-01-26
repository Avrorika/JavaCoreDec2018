package task02;

/**
 * Task 2-4
 */

public class Main {


    public static void main(String[] args) {

        Employee c = new Employee();
        c.setName("John");
        c.addToList(new Pen(2.15, 2, "pen", "gel"));
        c.addToList(new Pencil(2, 6, "pencil", "black"));
        c.addToList(new Ruler(0.15, 1, "ruler ", 15));
        c.printOut();
        c.totalPrice();


        EnterySet a = new EnterySet();
        a.addToList(new Pencil(2, 6, "pencil", "black"));
        a.addToList(new Pen(2.15, 2, "pen", "gel"));
        a.addToList(new Ruler(0.15, 1, "ruler ", 15));
        a.compareName();
        a.comparePrice();
        a.compareNameAndPrice();

    }
}

