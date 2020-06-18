
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class LectureJson {



    /**
     * Cette méthode vas permettre d'extraire les JSON Objects du fichier JSON
     *
     * @param fileName
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public static ArrayList<Activites> jsonFileToActivites(String fileName) throws IOException, ParseException {
        ArrayList<Activites> arrayActivites = new ArrayList<Activites>();
        String jsonText = DiskFile.loadFileIntoString(fileName);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(jsonText);
        JSONArray data = (JSONArray) object.getJSONArray("activites");
        jsonToActivite(data, arrayActivites);
        return arrayActivites;
    }

    /**
     * Cette méthode vas permettre de convertir les JSON objects extraits précédement en Object Activité.
     *
     * @param data
     * @param arrayActivites
     * @throws ParseException
     */
    private static void jsonToActivite(JSONArray data, ArrayList<Activites> arrayActivites) throws  ParseException {
        for (int i = 0; i < data.size(); i++) {
            Activites activite = new Activites();
            JSONObject document = data.getJSONObject(i);
            

            activite.setDescription(document.getString("description"));
            activite.setNbAccomps(document.getInt("nombre_parents_accompagnateurs"));
            activite.setPrixUniEleve(deStringADouble(document.getString("prix_unitaire_enfant")));
            activite.setPrixUniAdulte(deStringADouble(document.getString("prix_unitaire_adulte")));
            activite.setTransport(document.getInt("transport"));
            activite.setDistance(document.getDouble("distance"));
            activite.setDate(deStringADate(document.getString("date")));
            arrayActivites.add(activite);
            
        }
    }

    /**
     * Modifier l'age et le nombre d'élèves dans chaque activitée.
     *
     * @param fileName
     * @param arrayActivites
     * @throws IOException
     */
    public static void arrayActivite(String fileName, ArrayList<Activites> arrayActivites) throws IOException {
        String jsonText = DiskFile.loadFileIntoString(fileName);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(jsonText);
        for (Activites activite : arrayActivites) {
            if (object.containsKey("age")) {
                activite.setAge(object.getInt("age"));
            }
            if (object.containsKey("nombre_eleves")) {
                activite.setNombre_eleves(object.getInt("nombre_eleves"));
            }
        }
    }


    /**
     * Cette méthode vas permettre de convertir la chaîne de caractère en format date ISO8601
     *
     * @param text
     * @return
     * @throws ParseException
     */
    public static Date deStringADate(String text) throws java.text.ParseException {
        SimpleDateFormat ISO8601DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return ISO8601DATEFORMAT.parse(text);
    }

    /**
     * Cette méthode vas permettre de convertir la chaîne de caractère en format double pour le prix de l'activité
     *
     * @param text
     * @return
     */
    public static double deStringADouble(String text) {
        int position = text.length() - 1;
        if (text.contains(",")) {
            text = text.replace(',', '.');
        }
        text = text.substring(0, position);
        return Double.parseDouble(text);
    }
}


