public class Proprietaire{
    String name;

    public Proprietaire(String name){
        this.name = name;
    }

    public static Proprietaire getProprietaire(String name){
        return new Proprietaire(name);
    }

}
