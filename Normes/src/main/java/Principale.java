/*
 * But:
 * Générer un relevé de paye qui va contenir le matricule d’un employé ainsi que son salaire du mois.
 * Chaque employé travaille un maximum de 35 heures régulières par semaine, il est payé 40$/h. Cependant chaque employé peut effectué un maximum de 7 heures majorées par semaine, il est payé 60$/h majorée.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Principale {
    public static void main(String[] args) throws IOException, ParseException {
        if (args.length == 1) {
            try {
                Employe employe = new Employe();
                JsonWriter.writer(args[0], employe);
            } catch (FileNotFoundException e) {
                System.out.println("Verifiez vos path, le fichier que vous avez entré n'existe pas");
            }
        } else {
            System.out.println("Veuillez entrez un fichier json en argument.");
        }
    }
}
