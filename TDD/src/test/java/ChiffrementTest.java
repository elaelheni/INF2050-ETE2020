import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiffrementTest {
    @Test
    public void testEncodeCesar(){
        assertEquals("n", Chiffrement.encodeCesar("a"));
    }
    @Test
    public void testEncodeCesar2(){
        assertEquals("Obawbhe gbhg yr zbaqr", Chiffrement.encodeCesar("Bonjour tout le monde"));
    }
    @Test
    public void testEncodeCesar3(){
        assertEquals("Fnyhg !", Chiffrement.encodeCesar("Salut !"));
    }
    @Test
    public void testEncodeCesar4(){
        assertEquals("Salut !", Chiffrement.encodeCesar("Fnyhg !"));
    }
}