package classes;

import java.util.ArrayList;
import java.util.Date;

public class Realisateur extends Personne {
    private ArrayList<DVD> listeDVD;


    public Realisateur(String nom, String prenom, Date dnaissance) {
        super(nom, prenom, dnaissance);
        this.listeDVD = new ArrayList<DVD>();
    }

    public void ajout(DVD element) {
        listeDVD.add(element);
        element.setRealisateur(this);
    }

    public ArrayList<DVD> getListeDVD() {
        return listeDVD;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "listeDVD=" + listeDVD +
                '}';
    }
}
