package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() throws Exception {
        drumSticks = new DrumSticks(50.50, 70);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(50.50, drumSticks.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(70, drumSticks.getSellPrice(), 0.0);

    }

    @Test
    public void canGetMarkUp() {
        assertEquals(19.5, drumSticks.getMarkUp(drumSticks.getBuyPrice(), drumSticks.getSellPrice()), 0.0);
    }
}