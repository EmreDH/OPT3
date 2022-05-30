import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CessnaTest {

    @Test
    void opstijgen() {
        Cessna cessna = new Cessna(true, 1000, 50.00);

        assertTrue(cessna.Opstijgen(true, 1500, 70.00));

        assertFalse(cessna.Opstijgen(true, 1200, 40.00));
    }
}