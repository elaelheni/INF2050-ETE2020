import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTaxesTest {
    @Test
    public void testCalculerTaxes(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->CalculTaxes.calculerTaxe(0,true,true));
    }

    @Test
    public void testCalculerTaxes2(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->CalculTaxes.calculerTaxe(-9,true,true));

    }

    @Test
    public void testCalculerTaxes3(){
        assertEquals(105, CalculTaxes.calculerTaxe(100,true,false));
    }

    @Test
    public void testCalculerTaxes4(){
        assertEquals(110, CalculTaxes.calculerTaxe(100,false,true));
    }

    @Test
    public void testCalculerTaxes5(){
        assertEquals(115, CalculTaxes.calculerTaxe(100,true,true));
    }
}