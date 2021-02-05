package instruments;

import accessories.ISell;

public class DrumKit extends Instrument implements IPlay, ISell {

    private int symbols;
    private boolean snare;
    private boolean bassPedal;
    private double buyPrice;
    private double sellPrice;

    public DrumKit(String type, String material, String colour, int symbols, boolean snare, boolean bassPedal, double buyPrice, double sellPrice) {
        super(type, material, colour);
        this.symbols = symbols;
        this.snare = snare;
        this.bassPedal = bassPedal;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String sound(String noise){
        return noise;
    }

    public int getSymbols() {
        return symbols;
    }

    public void setSymbols(int symbols) {
        this.symbols = symbols;
    }

    public boolean getSnare() {
        return snare;
    }


    public void setSnare(boolean snare) {
        this.snare = snare;
    }

    public boolean isBassPedal() {
        return bassPedal;
    }

    public void setBassPedal(boolean bassPedal) {
        this.bassPedal = bassPedal;
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

    public double getMarkUp(double buyPrice, double sellPrice){
        return sellPrice -= buyPrice;
    }
}
