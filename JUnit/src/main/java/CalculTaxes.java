public class CalculTaxes {

    static final double TAXE_FEDERALE = 0.05;
    static final double TAXE_PROVINCIALE = 0.09975;

     public static long calculerTaxe (long sous, boolean taxeFed, boolean taxeProv) {
         long resultat = sous;
         if (resultat <= 0) {
             throw new IllegalArgumentException("Montant incorrect");

         }else{
             if (taxeFed) resultat+= Math.round(sous*TAXE_FEDERALE);
             if (taxeProv) resultat+= Math.round(sous*TAXE_PROVINCIALE);
         }


         return resultat;

     }
}
