public abstract class Instrument implements IPlay, ISell {

    private String colour;
    private String material;
    private String type;
    private double boughtPrice;
    private double sellingPrice;

    public Instrument(String colour, String material, String type, double boughtPrice, double sellingPrice) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
