import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getPrijsTest {

    @Test
    void getPrijs() {

        double gewicht1 = 999.00;
        double gewicht2 = 1500.00;
        double gewicht3 = 5000.00;

        assertEquals(100.00, new getPrijs (gewicht1).GetPrijs());
        assertEquals(500.00, new getPrijs(gewicht2).GetPrijs());
        assertEquals(2500.00, new getPrijs(gewicht3).GetPrijs());
    }

}