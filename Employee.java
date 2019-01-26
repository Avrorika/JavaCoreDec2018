package task02;

import java.util.ArrayList;


public class Employee implements Actions {

    String name;
    static double totalSum = 0;
    ArrayList<Stationery> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void addToList(Stationery stationery) {
        totalSum += stationery.getItemPrice() * stationery.getQt();
        list.add(stationery);
    }

    @Override
    public void removeFromList(Stationery stationery) {
        totalSum -= stationery.getItemPrice();
        list.remove(stationery);
    }

    @Override
    public void printOut() {
        System.out.println(name);
        for (Stationery stationery : list) {
            System.out.println(stationery.toString());
        }
    }

    @Override
    public void totalPrice() {
        System.out.println("Total sum is: " +totalSum);
    }


}


