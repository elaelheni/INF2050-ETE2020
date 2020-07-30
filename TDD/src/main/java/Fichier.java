public class Fichier {

    public static String nomFichier(String chemin){

        return chemin.substring(chemin.lastIndexOf('/')+1);
    }

    public static String extension (String chemin){

        return chemin.contains(".") ? chemin.substring(chemin.lastIndexOf('.')+1) : "";
    }

    public static int aleatoire (int max, int min){
        return (int) (Math.random() * (max-min + 1 ) + min);
    }

}
