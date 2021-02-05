import accessories.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell item){
            this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(stock.indexOf(item));
    }

    public double calculateTotalProfit(){
        double total = 0;
        for (ISell item : stock)
             total += item.getMarkUp();
        return total;
    }

}
