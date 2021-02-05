package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentTest {

    Instrument instrument;
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(6, "acoustic", "String", "pine", "green", 300, 400);

    }

    @Test
    public void canGetStringNumber(){
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals("acoustic", guitar.getGuitarType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("pine", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("green", guitar.getColour());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300.0, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(400.0, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void canSetGuitarType(){
        guitar.setGuitarType("electric");
        assertEquals("electric", guitar.getGuitarType());
    }

    @Test
    public void makesNoise(){
        assertEquals("Twaaang", guitar.sound("Twaaang"));
    }

}