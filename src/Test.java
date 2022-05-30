import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test {

    @Test
    void opstijgen() {
        Cessna cessna = new Cessna(true, 1000, 50.00);

        assertTrue(cessna.Opstijgen(true, 1500, 70.00));

        assertFalse(cessna.Opstijgen(true, 1200, 40.00));
    }

    @Test
    void getPrijs() {

        double gewicht1 = 999.00;
        double gewicht2 = 1500.00;
        double gewicht3 = 5000.00;

        assertEquals(100.00, new getPrijs(gewicht1).GetPrijs());
        assertEquals(500.00, new getPrijs(gewicht2).GetPrijs());
        assertEquals(2500.00, new getPrijs(gewicht3).GetPrijs());
    }

    @Test
    void getTotaalPrijsMetHonderdAlsBasisprijs() {

        assertEquals(900, TotaalPrijs.getTotaalPrijs(1, true, false));
    }

    @Test
    void getTotaalPrijsMetAlsVijfhonderdAlsBasisprijs() {
        assertEquals(181.5, TotaalPrijs.getTotaalPrijs(3, false, true));
    }

    @Test
    void getTotaalPrijsMetAlsTweeDuizendVijfHonderdAlsBasisprijs() {
        assertEquals(1089.0, TotaalPrijs.getTotaalPrijs(1, true, true));
    }
}