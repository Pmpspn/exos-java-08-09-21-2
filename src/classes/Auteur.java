package classes;

import java.util.ArrayList;
import java.util.Date;

public class Auteur extends Personne{
    private ArrayList<Livre> listeLivre;


    public Auteur(String nom, String prenom, Date dnaissance) {
        super(nom, prenom, dnaissance);
        this.listeLivre = new ArrayList<Livre>();
    }

    public void ajout(Livre element) {
        listeLivre.add(element);
        element.setAuteur(this);
    }

    public ArrayList<Livre> getListeLivre() {
        return listeLivre;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "listeLivre=" + listeLivre +
                '}';
    }
}
