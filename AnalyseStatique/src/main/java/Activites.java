import java.util.Date;

/**
 * Cette classe vas contenir les différents paramètres qui permettent la réalisation d'une activité.
 *
 * Les valeurs de base donnée pour chaque paramètre de l'activité sont prédéfinies pas des valeurs soit nulle soit négative
 * afin de pouvoir plus facilement procéder aux tests d'erreur dans le cas ou un paramètre est mal définie dans le test.json
 *
 * Des constructeurs get pour chaque paramètre sont construits afin de pouvoir y faire appelle dans les différentes méthodes.
 */

public class Activites {
    public int age =-1 ;
    public int nombre_eleves = -1;
    public  String description = null ;
    public int nbAccomps =-1;
    public double prixUniEleve = -1;
    public double prixUniAdulte  = -1;
    public int transport  = -1;
    public double distance  = -1;
    public Date date = null ;



    public Activites() {
    }

    public Activites(    int age , int nombre_eleves , String description, int nbAccomps,
                         double prixUniEleve , double prixUniAdulte , int transport  , double distance  , Date date ){
        this.age =age ;
        this.nombre_eleves =nombre_eleves;
        this.description = description ;
        this.nbAccomps =nbAccomps;
        this.prixUniEleve = prixUniEleve;
        this.prixUniAdulte  = prixUniAdulte;
        this.transport  = transport;
        this.distance  = distance;
        this.date = date ;
    }


    public int getAge() {
        return age;
    }

    public int getNombre_eleves() {
        return nombre_eleves;
    }

    public String getDescription() {
        return description;
    }

    public int getNbAccomps() {
        return nbAccomps;
    }

    public double getPrixUniEleve() {
        return prixUniEleve;
    }

    public double getPrixUniAdulte() {
        return prixUniAdulte;
    }

    public int getTransport() {
        return transport;
    }

    public double getDistance() {
        return distance;
    }

    public Date getDate() {
        return date;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNombre_eleves(int nombre_eleves) {
        this.nombre_eleves = nombre_eleves;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbAccomps(int nbAccomps) {
        this.nbAccomps = nbAccomps;
    }

    public void setPrixUniEleve(double prixUniEleve) {
        this.prixUniEleve = prixUniEleve;
    }

    public void setPrixUniAdulte(double prixUniAdulte) {
        this.prixUniAdulte = prixUniAdulte;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
