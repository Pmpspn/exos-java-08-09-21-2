package classes;

public class Livre extends Article {

    private String ISBN;
    private int nbPages;
    private Personne auteur;

    public Livre(String reference, String designation, double prix, String ISBN, int nbPages, Personne auteur) {
        super(reference, designation, prix);
        this.ISBN = ISBN;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Livre{" +
                "ISBN='" + ISBN + '\'' +
                ", nbPages=" + nbPages +
                ", auteur='" + auteur.getNom() + '\'' +
                '}';
    }
}
