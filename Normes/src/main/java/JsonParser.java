import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.IOException;
import java.text.ParseException;

public class JsonParser {
    public static Employe jsonFileToEmploye(String fileName, Employe employe) throws IOException, ParseException {
        String jsonText = DiskFile.loadFileIntoString(fileName);
        JSONObject object = (JSONObject) JSONSerializer.toJSON(jsonText);
// Cette ligne permet de charger un String dans un JSONObject
        jsonToEmploye(object, employe);
        return employe;
    }

    /*
     * */
    public static void jsonToEmploye(JSONObject object, Employe employe) throws ParseException {
        employe.setNom(object.getString("nom"));
        employe.setMatricule(object.getString("matricule"));
        JSONObject heuresObject = (JSONObject) object.get("heures");
        employe.setHeuresReg(heuresObject.getInt("regulieres"));
        employe.setHeuresMaj(heuresObject.getInt("majorees"));
        employe.setMois(object.getString("mois"));
    }
}
