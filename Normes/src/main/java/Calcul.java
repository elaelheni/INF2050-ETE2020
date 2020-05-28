public class Calcul {
    static final double PRIX_H_REG = 40;
    static final double PRIX_H_MAJ = 60;

    public static double calculSalaire(int heuresReg, int heuresMaj) {
        return (heuresReg * PRIX_H_REG) + (heuresMaj * PRIX_H_MAJ);
    }
}
