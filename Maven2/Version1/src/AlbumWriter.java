import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class AlbumWriter {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("album", "CCR", "Cosmo's Factory", 1970, 4));
        albums.add(new Album("album", "The Beatles", "Sgt Pepper", 1967, 4));
        albums.add(new Album("album", "Daniel Bélanger", "Rêver mieux", 2001, 4));

        JSONArray arrayAlbum = new JSONArray();
        for (Album album : albums){
            JSONObject albumJSON = new JSONObject();
            albumJSON.put("type", album.getType());
            albumJSON.put("title", album.getTitre());
            albumJSON.put("artist", album.getArtiste());
            albumJSON.put("publication", album.getPublication());
            albumJSON.put("rating", album.getRating());
            arrayAlbum.add(albumJSON);
        }

        JSONObject collection = new JSONObject();
        collection.put("collection", arrayAlbum);
        try {
            DiskFile.saveStringIntoFile("output.json",collection.toString(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
