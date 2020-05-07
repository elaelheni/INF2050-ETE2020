import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichier {

    public LectureFichier (){}

    public static Scanner fichier;

    static {
        try{
            fichier = new Scanner (new File("Livres.txt"));
        }catch (FileNotFoundException e){
            System.out.println("Le fichier n'existe pas");

        }
    }
     public static void affichage (){
        while(fichier.hasNextLine()){
            String line = fichier.nextLine();
            System.out.println(line);
        }
        fichier.close();
     }



}
