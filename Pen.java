package task02;


public class Pen extends Stationery {

    String inkType;

    public Pen(double itemPrice, int qt, String type, String inkType) {
        super(itemPrice, qt, type);
        this.inkType = inkType;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public String toString() {

        return "Type: " + getType() + ", Ink Type: " + inkType + ", Units Price: " + getItemPrice() * qt;

    }
}
