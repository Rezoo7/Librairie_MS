package model;

public class Livre {

    private String title;
    private Auteur lauteur;
    private int parution;
    private int pages;

    public Livre(String titre, Auteur aut, int paru, int nbpages){


        this.lauteur = aut;
        this.title = titre;
        this.parution = paru;
        this.pages = nbpages;

    }

    @Override
    public String toString() {
        return
                "Titre='" + title + '\'' +
                ", Auteur= OHOH!" + lauteur +
                ", Parution=" + parution +
                ", Pages=" + pages + "p "+ "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Auteur getLauteur() {
        return lauteur;
    }

    public void setLauteur(Auteur lauteur) {
        this.lauteur = lauteur;
    }

    public int getParution() {
        return parution;
    }

    public void setParution(int parution) {
        this.parution = parution;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
