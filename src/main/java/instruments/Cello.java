package instruments;

import accessories.ISell;

public class Cello extends Instrument implements IPlay, ISell {

    private int stringNumber;
    private String placeOfManufacture;
    private double buyPrice;
    private double sellPrice;

    public Cello(String type, String material, String colour, int stringNumber, String placeOfManufacture, double buyPrice, double sellPrice) {
        super(type, material, colour);
        this.stringNumber = stringNumber;
        this.placeOfManufacture = placeOfManufacture;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String sound(String noise){
        return noise;
    }

    public void setPlaceOfManufacture(String placeOfManufacture) {
        this.placeOfManufacture = placeOfManufacture;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public String getPlaceOfManufacture() {
        return placeOfManufacture;
    }

    public double getMarkUp(){
        return sellPrice -= buyPrice;
    }
}
