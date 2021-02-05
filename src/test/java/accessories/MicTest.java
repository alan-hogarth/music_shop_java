package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MicTest {

    Mic mic;

    @Before
    public void setUp() throws Exception {
        mic = new Mic(85, 99);
    }

    @Test
    public void getBuyPrice() {
        assertEquals(85, mic.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(99, mic.getSellPrice(), 0.0);

    }

    @Test
    public void canGetMarkUp() {
        assertEquals(14.0, mic.getMarkUp(mic.getBuyPrice(), mic.getSellPrice()), 0.0);
    }
}