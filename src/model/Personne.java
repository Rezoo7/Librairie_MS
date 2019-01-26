package model;

public abstract class Personne {

    private String pren;
    private String nom;
    private short ddn;

    public Personne(String prenom,String nom,short ddn){

        this.pren = prenom;
        this.nom = nom;
        this.ddn = ddn;
    }

    public String getPren() {
        return this.pren;
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

    public void setDdn(short ddn) {
        this.ddn = ddn;
    }
}
