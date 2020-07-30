public class Fichier {

    public static String nomFichier(String chemin){

        return chemin.substring(chemin.lastIndexOf('/')+1);
    }

    public static String extension (String chemin){
        return chemin;
    }

}
