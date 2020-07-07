import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodExample{
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        veterinaire();
    }

    /**
     *
     */
    public static void veterinaire(){


        String nom = null;
        String nomChien = null;
        String race = null;
        int age =0;

        validationClavier(nom, nomChien, race);
        validationAge(age);

        Proprietaire.getProprietaire(nom);
        Dog.getDog(nomChien,age,race);



    }

    /**
     *
     * @param nom
     * @param nomChien
     * @param race
     */

    public static void validationClavier(String nom,  String nomChien, String race){
        Scanner input = new Scanner(System.in);

        do{
            nom = nomProprietaire(input);
            nomChien = nomChien(input);
            race = race(input);

        }while(validationCondition(nom, nomChien, race));
    }

    /**
     *
     * @param input
     * @return
     */

    public static String nomProprietaire (Scanner input){

        System.out.println("Entrez le nom du proprietaire:");
        return input.nextLine().toLowerCase();
    }

    /**
     *
     * @param input
     * @return
     */

    public static String nomChien (Scanner input){
        System.out.println("Entrez le nom du chien:");
        return input.nextLine().toLowerCase();

    }

    /**
     *
     * @param input
     * @return
     */

    public static String race (Scanner input){
        System.out.println("Entrez la race du chien:");
        return input.nextLine().toLowerCase();
    }

    /**
     *
     * @param nom
     * @param nomChien
     * @param race
     * @return
     */

    public static boolean validationCondition(String nom, String nomChien, String race){
        return (nom.equals("\n")|| nomChien.equals("\n")||race.equals("\n"));
    }

    /**
     *
     * @param age
     */

    public static void validationAge(int age){
        Scanner input = new Scanner(System.in);
        do {
            age = ageChien(input);
        }while(intervalleAge(age));

    }

    /**
     *
     * @param input
     * @return
     */

    public static int ageChien (Scanner input){
        int age =-1;
        try  {
            System.out.println("Entrez l'age du chien':");
            age = input.nextInt();


       }catch(InputMismatchException e){
            System.out.println("Erreur, mauvais type!");
            System.exit(0);

        }

        return age;
    }

    /**
     *
     * @param age
     * @return
     */

    public static boolean intervalleAge (int age){
        return (age<0 || age >15);
    }
}


