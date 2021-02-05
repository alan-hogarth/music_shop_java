import accessories.EffectPedal;
import accessories.ISell;
import accessories.Mic;
import instruments.Cello;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;
    EffectPedal effectPedal;
    Cello cello;
    Mic mic;

    @Before
    public void setUp() {
        shop = new Shop(stock);
        guitar = new Guitar(6, "acoustic", "String", "pine", "green", 300, 400);
        mic = new Mic(55, 68);
    }
    

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(mic);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStock().size());
    }
}