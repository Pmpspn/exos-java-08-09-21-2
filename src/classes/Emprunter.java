package classes;

import java.time.LocalTime;

public class Emprunter {

    private LocalTime dte;
    private Article article;

    public Emprunter(LocalTime dte, Article article) {
        this.dte = dte;
        this.article = article;
    }

    public LocalTime getDte() {
        return dte;
    }

    public void setDte(LocalTime dte) {
        this.dte = dte;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }


}
