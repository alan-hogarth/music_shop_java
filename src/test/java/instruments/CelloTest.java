package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CelloTest {

    Cello cello;

    @Before
    public void setUp() {
        cello = new Cello("String", "mahogany", "brown", 4, "Venice", 1500, 2800);

    }

    @Test
    public void hasType() {
        assertEquals("String", cello.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("mahogany", cello.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("brown", cello.getColour());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, cello.getStringNumber());
    }

    @Test
    public void hasAPlaceOfManufacture(){
        assertEquals("Venice", cello.getPlaceOfManufacture());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1500.0, cello.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2800.0, cello.getSellPrice(), 0.0);
    }

    @Test
    public void makesNoise(){
        assertEquals("vzzvzvzvvz", cello.sound("vzzvzvzvvz"));
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(1300.0, cello.getMarkUp(cello.getBuyPrice(), cello.getSellPrice()), 0.0);
    }

}