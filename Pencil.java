package task02;

public class Pencil extends Stationery {
    String colour;

    public Pencil(double itemPrice, int qt, String type, String colour) {
        super(itemPrice, qt, type);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {

        return "Type: " + getType() + ", Colour: " + colour + ", Units Price: " + getItemPrice() * qt;

    }
}
