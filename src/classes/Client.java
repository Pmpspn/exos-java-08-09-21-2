package classes;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Client extends Personne {

    private ArrayList<Emprunter> listeEmprunt;

    public Client(String nom, String prenom, Date dnaissance) {
        super(nom, prenom, dnaissance);
        this.listeEmprunt = new ArrayList<Emprunter>();
    }

    public void AjouterArticle(LocalTime dte, Article a)
    {
        Emprunter e = new Emprunter(dte, a);
        listeEmprunt.add(e);
    }

}
