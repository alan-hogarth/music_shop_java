package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void setUp() {
        drumKit = new DrumKit("Percussion", "metal", "black", 4, true, true, 2300, 4500);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Percussion", drumKit.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("metal", drumKit.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", drumKit.getColour());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(2300.0, drumKit.getBuyPrice(), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(4500.0, drumKit.getSellPrice(), 0.0);
    }

    @Test
    public void hasSymbols(){
        assertEquals(4, drumKit.getSymbols());

    }

    @Test
    public void hasSnare(){
        assertEquals(true, drumKit.getSnare());

    }

    @Test
    public void hasBassPedal(){
        assertEquals(true, drumKit.isBassPedal());

    }

    @Test
    public void makesNoise(){
        assertEquals("bang thud crash", drumKit.sound("bang thud crash"));
    }


    @Test
    public void canGetMarkUp() {
        assertEquals(2200.0, drumKit.getMarkUp(), 0.0);
    }
}