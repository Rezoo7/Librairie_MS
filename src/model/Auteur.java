package model;

import java.util.*;

public class Auteur {

    private String pren;
    private String nom;
    private int ddn;
    private ArrayList<Livre> liste;



    public Auteur(String prenom,String nom,int ddn){

        this.pren = prenom;
        this.nom = nom;
        this.ddn = ddn;
        this.liste = new ArrayList<Livre>();

    }

    public void ajouterLivre(Livre l){

        this.liste.add(l);
    }


    public boolean supprimerLivre(Livre li){

        if(!this.liste.contains(li)){
            return false;
        }
        else{
            this.liste.remove(li);
            return true;
        }

    }

    public String saListe(){

        return "Auteur "+ this.nom +" :\n" +this.liste.toString();
    }



    public String getPren() {
        return pren;
    }

    public void setPren(String pren) {
        this.pren = pren;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDdn() {
        return ddn;
    }

    public void setDdn(int ddn) {
        this.ddn = ddn;
    }


    @Override
    public String toString() {
        return "model.Auteur: " +
                "Prenom= " + pren + " "  +
                ", Nom= " + nom + " " +
                ", Date de Naissance ->  " + ddn + " ";
    }
}
