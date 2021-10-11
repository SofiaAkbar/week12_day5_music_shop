public class Piano extends Instrument{

    private String typeOfKeyboard;

    public Piano(String colour, String material, String type, double boughtPrice, double sellingPrice, String typeOfKeyboard) {
        super(colour, material, type, boughtPrice, sellingPrice);
        this.typeOfKeyboard = typeOfKeyboard;
    }

    public String getTypeOfKeyboard() {
        return typeOfKeyboard;
    }

    public String play(){
        return "Playing Piano";
    }

    public double calculateMarkup(){
        return (getSellingPrice() / getBoughtPrice()) * 100;
    }

}
