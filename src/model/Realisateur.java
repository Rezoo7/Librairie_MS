package model;

import java.util.ArrayList;

public class Realisateur extends Personne {

    private ArrayList<Film> liste;

    public Realisateur(String prenom, String nom, short ddn) {
        super(prenom, nom, ddn);
    }


    public void ajouterFilm(Film f){

        this.liste.add(f);
    }

    public boolean supprimerLivre(Film f){

        if(!this.liste.contains(f)) return false;
        else{
            this.liste.remove(f);
            return true;
        }
    }

    public String saListe(){
        return "Auteur ==> "+ super.getNom() +" :\n" +this.liste.toString();
    }
}
