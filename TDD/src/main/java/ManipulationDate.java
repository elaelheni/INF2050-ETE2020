import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ManipulationDate {

    private static final String[] moisRef = {"", "janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};


    public static String dateLisible (String dateIso){


        int annee = Integer.parseInt(dateIso.substring(0, dateIso.indexOf('-')));
        int mois = Integer.parseInt(dateIso.substring(dateIso.indexOf('-')+1, dateIso.lastIndexOf('-')));
        int jour = Integer.parseInt(dateIso.substring( dateIso.lastIndexOf('-') +1));
        return String.format("%d%s %s %d", jour, jour == 1 ? "er" : "", moisRef[mois], annee);
    }

    public static int ageDate (Date debut, Date fin){
        Calendar calDebut = creer(debut);
        Calendar calFin = creer(fin);

        int difference = calFin.get(Calendar.YEAR) - calDebut.get(Calendar.YEAR);
        if (calFin.get(Calendar.MONTH) < calDebut.get(Calendar.MONTH) ||(calFin.get(Calendar.MONTH) == calDebut.get(Calendar.MONTH) && calFin.get(Calendar.DATE) < calDebut.get(Calendar.DATE))){
            difference --;
        }



        return difference;
    }

    private static Calendar creer (Date debut){
        Calendar calendrier = Calendar.getInstance(Locale.CANADA_FRENCH);
        calendrier.setTime(debut);
        return calendrier;
    }

    public static int age (LocalDate debut, LocalDate fin){
        return Period.between(debut, fin).getYears();

    }
}
