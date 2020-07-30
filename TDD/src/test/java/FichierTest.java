import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FichierTest {

    @Test
    public void testNomFichier() {
        assertEquals("fichier.txt", Fichier.nomFichier("/Users/ela/blabla/fichier.txt"));
    }

  @Test
    public void testNomFichier2 (){
      assertEquals("fichier.txt", Fichier.nomFichier("blabla/fichier.txt"));
  }

  @Test
    public void testExtension(){
        assertEquals("txt", Fichier.extension("/Users/ela/blabla/fichier.txt"));
  }
  @Test
    public void testExtension2(){
      assertEquals("", Fichier.extension("/Users/ela/blabla/fichier"));
  }

  @Test
    public void testAleatoire(){
        assertTrue ( Fichier.aleatoire(8,5) >= 5 && Fichier.aleatoire(8,5) <= 8);
  }
}