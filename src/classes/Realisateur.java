package classes;

import java.util.ArrayList;
import java.util.Date;

public class Realisateur extends Personne {
    private ArrayList<Video> listeVideo;


    public Realisateur(String nom, String prenom, Date dnaissance) {
        super(nom, prenom, dnaissance);
        this.listeVideo = new ArrayList<Video>();
    }

    public void ajout(Video element) {
        listeVideo.add(element);
        element.setRealisateur(this);
    }

    public ArrayList<Video> getListeDVD() {
        return listeVideo;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "listeDVD=" + listeVideo +
                '}';
    }
}
