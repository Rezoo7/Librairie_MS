package model;

import java.util.*;

public class Auteur extends Personne {

    private ArrayList<Livre> liste;


    public Auteur(String nom,String pren,short ddn){
        super(nom,pren,ddn);
        this.liste = new ArrayList<Livre>();

    }

    public void ajouterLivre(Livre l){

        this.liste.add(l);
    }

    public boolean supprimerLivre(Livre li){

        if(!this.liste.contains(li)) return false;
        else{
            this.liste.remove(li);
            return true;
        }
    }

    public String saListe(){
        return "Auteur "+ super.getNom() +" :\n" +this.liste.toString();
    }

    @Override
    public String toString() {
        return "model.Auteur: " +
                "Prenom= " + super.getPren() + " "  +
                ", Nom= " + super.getNom() + " " +
                ", Date de Naissance ->  " + super.getDdn();
    }
}
