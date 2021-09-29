package classes;

import java.util.ArrayList;
import java.util.Date;

public class Client extends Personne {

    private ArrayList<Article> listeArticle;

    public Client(String nom, String prenom, Date dnaissance) {
        super(nom, prenom, dnaissance);
        this.listeArticle = new ArrayList<Article>();
    }

    public void emprunterArticle(Article a) {
        listeArticle.add(a);
        a.setClient(this);
    }
}
