package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
    private String nom;
    private String prenom;
    private Date dnaissance;

    public Personne(String nom, String prenom, Date dnaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dnaissance = dnaissance;
    }

    SimpleDateFormat dt1 = new SimpleDateFormat("MM/dd");

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date de naissance=" + dt1.format(dnaissance) +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDnaissance() {
        return dnaissance;
    }
}
