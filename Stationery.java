package task02;

class Stationery {

    public Stationery(double itemPrice, int qt, String type) {
        this.itemPrice = itemPrice;
        this.type = type;
        this.qt=qt;

    }
    private double itemPrice;
    String type;
    int qt;

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String brand) {
        this.type = brand;
    }

}
