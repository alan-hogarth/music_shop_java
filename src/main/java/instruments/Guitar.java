package instruments;

public class Guitar extends Instrument implements IPlay{

    private int stringNumber;
    private String guitarType;
    private double buyPrice;
    private double sellPrice;

    public Guitar(int stringNumber, String guitarType, String type, String material, String colour, double buyPrice, double sellPrice) {
        super(type, material, colour);
        this.stringNumber = stringNumber;
        this.guitarType = guitarType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String sound(String noise){
        return noise;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double wholesale) {
        this.buyPrice = wholesale;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
