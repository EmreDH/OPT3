import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotaalPrijsTest {

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