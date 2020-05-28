import net.sf.json.JSONObject;

public class Employe {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public JSONObject getHeures() {
        return heures;
    }

    public void setHeures(JSONObject heures) {
        this.heures = heures;
    }

    public int getHeuresReg() {
        return heuresReg;
    }

    public void setHeuresReg(int heuresReg) {
        this.heuresReg = heuresReg;
    }

    public int getHeuresMaj() {
        return heuresMaj;
    }

    public void setHeuresMaj(int heuresMaj) {
        this.heuresMaj = heuresMaj;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    String nom;
    String matricule;
    JSONObject heures;
    int heuresReg;
    int heuresMaj;
    String mois;

}
