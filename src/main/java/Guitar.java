public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String colour, String material, String type, double boughtPrice, double sellingPrice, int numberOfStrings) {
        super(colour, material, type, boughtPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Playing guitar";
    }

    public double calculateMarkup(){
        return (getSellingPrice() / getBoughtPrice()) * 100;
    }

}
