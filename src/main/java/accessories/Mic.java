package accessories;

public class Mic implements ISell{

    private double buyPrice;
    private double sellPrice;

    public Mic(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
