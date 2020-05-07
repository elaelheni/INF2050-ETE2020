import java.io.IOException;

public class Principale {

    public static void main (String[] args) throws IOException {
        System.out.println("Hello World");

        int x = 5;
        int y = 7;
        //System.out.println("avant la permutation" + x + y);

         int temp =x;
         x = y;
         y = temp;

        //System.out.println("après la permutation" + x + y);

        //LectureFichier.affichage();
        System.out.println(Utf8File.loadFileIntoString("Livres.txt"));

    }
}
