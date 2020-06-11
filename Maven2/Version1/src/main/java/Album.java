public class Album {
    private String type;

    public String getType() {
        return type;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getPublication() {
        return publication;
    }

    public int getRating() {
        return rating;
    }

    private String titre;
    private String artiste;
    private int publication;
    private int rating;

    public Album (String type, String artiste, String titre, int publication, int rating){
        this.artiste=artiste;
        this.titre = titre;
        this.type=type;
        this.publication=publication;
        this.rating=rating;
    }
}
