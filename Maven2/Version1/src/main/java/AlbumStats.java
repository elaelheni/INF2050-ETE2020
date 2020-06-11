import java.io.IOException;
import java.util.ArrayList;

public class AlbumStats {
    public static void main (String[] args){
        String filename ="collection.json";

        try{
            ArrayList<Album> albums = JsonParser.jsonFileToAlbum(filename);
            stat(albums);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void stat (ArrayList<Album> albums){
        int nbAlbums = 0;
        int nbSingles = 0;
        int depuis2003 = 0;
        int note5 =0;


        for (Album album : albums){
            if (album.getType().equals("album"))
                nbAlbums++;
            else
                nbSingles++;

            if (album.getPublication()>=2003)
                depuis2003++;
            if (album.getRating() == 5)
                note5++;

        }

        System.out.printf("Nombre d'albums: %d%nNombre de singles: %d%nNombre d'albums depuis 2003: %d%nNobre d'album dont la note est 5: %d%n",nbAlbums,nbSingles,depuis2003,note5);
    }
}
