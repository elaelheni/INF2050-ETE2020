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
}