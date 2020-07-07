/*
 *REVISION PAS ENCORE TERMINÉE 
 *
 */



import java.util.InputMismatchException;
import java.util.Scanner;
public class HILO {

    final static int MAX = 101;
    final static int MIN = 0;
    final static int PARTIES_MAX = 10;

    final static String MSG_ENTREE = "Bienvenu dans le jeu HILO";
    final static String ENTREZ_UN_NOMBRE = "Veuillez entrer un nombre:";
    final static String PLUS_BAS = "Plus bas !";
    final static String PLUS_HAUT = "Plus haut !";
    final static String ERR_NOMBRE = "le nombre doit etre entre 0 et 100 inclusivement! Veuillez etrer un nouveau nombre:";
    final static String NOUVELLE_PARTIE = "Voulez-vous jouer une nouvelle partie?(oui/non)";
    final static String GAGNE = "Felicitations! Vous avez gagné";
    final static String PERDU = "Désolé! Vous avez perdu";
    final static String MAUVAIS_TYPE = "Erreur, mauvais type!";
    final static String OUI = "OUI";
    final static String NON = "NON";

    public static int nbrMystere()  {
        return (int) (Math.random()*(MAX-MIN)+MIN);
    }
     public static Scanner getInput(){
         return new Scanner(System.in);
     }


    public static int recupNbrEntre(Scanner input){
        System.out.println(ENTREZ_UN_NOMBRE);
        return input.nextInt ();
    }

    public static void evaluationNbr(int nbr, int nbrMystere, int cmp, int cmp2){

        if (intervalleNbr(nbr)){
            if (plusBas(nbr,nbrMystere)){
                System.out.println(PLUS_BAS);
            }else if (plusHaut(nbr, nbrMystere)){
                System.out.println(PLUS_HAUT);
            }
            compteur(cmp);
        }else {
            System.out.println (ERR_NOMBRE);
        }
        nbr= getInput().nextInt();
        if (nbr==nbrMystere){
            System.out.println (GAGNE);
            compteur(cmp2);
        }else if (nbr!=nbrMystere && cmp == PARTIES_MAX){
            System.out.println (PERDU);}

    }

    public static void nbrEntre (int nbrMystere, int cmp, int cmp2) {
        int nbr = 0;
        do {
            try {
                nbr = recupNbrEntre(getInput());
                evaluationNbr(nbr, nbrMystere, cmp, cmp2);


            } catch (InputMismatchException e) {
                System.out.println(MAUVAIS_TYPE);
                System.exit(0);

            }
        }while(nbr != nbrMystere && cmp < PARTIES_MAX);

    }
    public static boolean intervalleNbr (int nbr){
        return ((nbr >= 0) && (nbr <= 100));
    }

    public static boolean plusBas (int nbr, int nbrMystere){
        return nbr>nbrMystere;
    }
    public static boolean plusHaut (int nbr, int nbrMystere){
        return nbr<nbrMystere;
    }

    public static int compteur (int cmp){
        return cmp++;
    }







    public static void main (String[] args){

        int nbrEntre = 0;
        int partiesJouees = 0 ;
        int partiesGagnees = 0;
        String decision = null;
        String resultat = null;
        String annonce = null;
        int tauxReussite = 0;



        do{
            System.out.println(MSG_ENTREE);
            int nbrMystere= nbrMystere() ;
            nbrEntre = recupNbrEntre(getInput());
            int nbrTentatives= 1;

            nbrEntre(nbrMystere,nbrTentatives,partiesGagnees);
            compteur(partiesJouees);


            do{
                System.out.println(NOUVELLE_PARTIE);
                decision = getInput().next();
                if (decision.equalsIgnoreCase("non")){
                    resultat = "Vous avez joué " +partiesJouees +" partie";
                    if (partiesJouees>1){
                        resultat = resultat+"s";

                    }
                    System.out.println (resultat);
                    String ch1= "Vous avez gagné "+partiesGagnees+" partie";
                    String ch2= "sur les" + partiesJouees+ "parties jouées.";
                    if (partiesGagnees>1){
                        ch1 = ch1 + "s";}
                    ch2 = " sur la seule partie que vous avez jouée.";

                    annonce = ch1+ch2;
                    System.out.println (annonce);
                    tauxReussite = (partiesGagnees*100)/partiesJouees;
                    System.out.println ("Votre taux de succs est: " +tauxReussite+ "%");
                }

            }while(!decision.equalsIgnoreCase (NON) && !decision.equalsIgnoreCase (NON));
        }while (decision.equalsIgnoreCase (OUI));
    }


}
