package task02;

public class Ruler extends Stationery {
    int length;

    public Ruler(double itemPrice, int qt, String type, int length) {
        super(itemPrice, qt, type);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {

        return "Type: " + getType() + ", Length: " + length + ", Units Price: " + getItemPrice() * qt;

    }
}
