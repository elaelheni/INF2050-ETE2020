import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MothodExampleTest {
    @Test
    public void testIntervalleAge(){
        assertEquals(true, MethodExample.intervalleAge(-1));
    }

    @Test
    public void testIntervalleAge2(){
        assertTrue(MethodExample.intervalleAge(16));
    }

    @Test
    public void testIntervalleAge3(){
        assertFalse(MethodExample.intervalleAge(10));
    }

    @Test
    public void testValidationCondition(){
        assertTrue(MethodExample.validationCondition("\n","Youpi","chocho"));
    }

    @Test
    public void testValidationCondition2(){
        assertFalse(MethodExample.validationCondition("Kitty","Youpi","chocho"));
    }

    @Test
    public void testNomProprietaire() {
        ByteArrayInputStream input = new ByteArrayInputStream(("toto").getBytes());
        System.setIn(input);
        Scanner sc = new Scanner(System.in);
        assertEquals("toto",MethodExample.nomProprietaire(sc));

    }

    @Test
    public void testNomChien() {
        ByteArrayInputStream input = new ByteArrayInputStream(("winnie").getBytes());
        System.setIn(input);
        Scanner sc = new Scanner(System.in);
        assertEquals("winnie",MethodExample.nomChien(sc));

    }
    @Test
    public void testRace() {
        ByteArrayInputStream input = new ByteArrayInputStream(("chiouaoua").getBytes());
        System.setIn(input);
        Scanner sc = new Scanner(System.in);
        assertEquals("chiouaoua",MethodExample.race(sc));

    }
}