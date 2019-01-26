package task02;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class EnterySet implements Actions {

    List<Stationery> enterySet = new ArrayList<>();

    public void addToList(Stationery stationery) {
        enterySet.add(stationery);
    }

    @Override
    public void removeFromList(Stationery stationery) {
        enterySet.remove(stationery);
    }

    @Override
    public void printOut() {
        System.out.println("Your sorted entery set ");
        for (Stationery sortedStationery : enterySet) {
            System.out.println(sortedStationery.getType() + "   " + sortedStationery.getItemPrice() + "\t");
        }
    }

    @Override
    public void totalPrice() {

    }

    void compareName() {
        enterySet.sort(Comparator.comparing(Stationery::getType));
        printOut();
    }

    void comparePrice() {
        enterySet.sort(Comparator.comparing(Stationery::getItemPrice));
        printOut();
    }

    void compareNameAndPrice() {
        enterySet.sort(Comparator.comparing(Stationery::getType).thenComparing(Stationery::getItemPrice));
        printOut();
    }
}








