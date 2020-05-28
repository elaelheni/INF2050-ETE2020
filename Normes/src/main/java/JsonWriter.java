import net.sf.json.JSONObject;

import java.io.IOException;
import java.text.ParseException;

public class JsonWriter {
    public static void writer(String fichEntr, Employe employe) throws IOException, ParseException {
        JsonParser.jsonFileToEmploye(fichEntr, employe);
        JSONObject releve = new JSONObject();
        releve.put("mois", employe.getMois());
        releve.put("matricule", employe.getMatricule());
        releve.put("salaire", Calcul.calculSalaire(employe.getHeuresReg(), employe.getHeuresMaj()));
        try {
            DiskFile.saveStringIntoFile("releve.json", releve.toString(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
