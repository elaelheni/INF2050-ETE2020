public class Monnaie {
    final long sous;

    public Monnaie(long sous) {
        this.sous=sous;
    }

    public long getSous(){
        return sous;
    }

    public Monnaie additionner(Monnaie autre){
        return  new Monnaie(this.sous + autre.sous);
    }

    public Monnaie soustraire(Monnaie autre){
        return  new Monnaie(this.sous - autre.sous);
    }

    public Monnaie pourcentage (double pourcentage){
        return new Monnaie (Math.round(this.sous * (pourcentage/100)));
    }

    @Override
    public String toString(){
        String decimales = this.sous % 100 < 10 ? "0"+this.sous % 100 :
                String.valueOf(this.sous % 100);
        return this.sous / 100 + "," + decimales + "$";
    }




}
