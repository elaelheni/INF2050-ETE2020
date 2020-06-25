import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonnaieTest {
    @Test
    public void testGetSous(){
        Monnaie m1 = new Monnaie(1000);
        assertEquals(1000, m1.getSous());
    }

    @Test
    public void testAdditionner(){
        Monnaie m1 = new Monnaie(1000);
        Monnaie m2 = new Monnaie(100);
        assertEquals(1100, m2.additionner(m1).getSous());
    }

    @Test
    public void testSoustraire(){
        Monnaie m1 = new Monnaie(1000);
        Monnaie m2 = new Monnaie(100);
        assertEquals(900, m1.soustraire(m2).getSous());
    }

    @Test
    public void testPourcentage(){
        Monnaie m1 = new Monnaie(1000);
        assertEquals(500,m1.pourcentage(50).getSous());
    }

    @Test
    public void testToString(){
        Monnaie m1 = new Monnaie(3505);
        assertEquals("35,05$",m1.toString());
    }
    @Test
    public void testToString2(){
        Monnaie m1 = new Monnaie(5);
        assertEquals("0,05$",m1.toString());
    }
    @Test
    public void testToString3(){
        Monnaie m1 = new Monnaie(10);
        assertEquals("0,10$",m1.toString());
    }


}