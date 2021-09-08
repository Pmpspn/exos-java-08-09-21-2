package main;

import classes.*;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Article a1 = new Article("00001", "Pain", 1.1);
        // Article a2 = new Article("00002", "Eau", 10.0);
        // Date dn2 = new Date(1996, Calendar.FEBRUARY, 12);
        // Date dn3 = new Date(1853, Calendar.JANUARY, 9);
        // Personne p1 = new Personne("Rowling", "JK", dn1);
        // Personne p2 = new Personne("Raimi", "Sam", dn2);
        // Personne p3 = new Personne("Favreau", "Jhon", dn3);

        // DVD d1 = new DVD("0005", "Spider-Man", 59.99, 140, p2);
        // DVD d2 = new DVD("0005", "Iron Man", 49.99, 154, p3);
        // System.out.println(a1.toString());
        // System.out.println(a2.toString());
        // System.out.println(l1.toString());
        // System.out.println(l2.toString());
        // System.out.println(d1.toString());
        // System.out.println(d2.toString());

        // Auteur a1 = new Auteur("JK", "Rowling", new Date(2000, Calendar.OCTOBER, 24));
        // Livre l1 = new Livre("0003", "Harry Potter 1", 35.0, "346346346", 543, a1);
        // Livre l2 = new Livre("0004", "Harry Potter 2", 35.0, "634462466", 654, a1);
        // a1.ajout(l1);
        // a1.ajout(l2);
        // System.out.println(l1.toString());
        // System.out.println(a1.getListeLivre().toString());
        // System.out.println(a1.getListeLivre().get(0).toString());

        Realisateur r1 = new Realisateur("Jean", "Kevin",new Date(2000, Calendar.OCTOBER, 24));
        DVD dvd1 = new DVD("6546", "34534LELIVREEU", 53, 53, r1);
        DVD dvd2 = new DVD("6353546", "34534LELIVrgfdgREEU", 53, 53, r1);
        r1.ajout((dvd1));
        r1.ajout((dvd2));
        System.out.println(r1.getListeDVD().toString());
    }
}
