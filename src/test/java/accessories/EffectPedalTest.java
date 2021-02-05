package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EffectPedalTest {

    EffectPedal effectPedal;

    @Before
    public void setUp() throws Exception {
        effectPedal = new EffectPedal(100.20, 150);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(100.2, effectPedal.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(150, effectPedal.getSellPrice(), 0.0);

    }

    @Test
    public void canGetMarkUp() {
        assertEquals(49.8, effectPedal.getMarkUp(effectPedal.getBuyPrice(), effectPedal.getSellPrice()), 0.0);
    }
}