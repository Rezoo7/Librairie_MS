package model;

public class Film {

    private String title;
    private Realisateur rea;
    private short parution;
    private double time;

    public Film(String titre, Realisateur rea, short paru, double time){

        this.title = titre;
        this.rea = rea;
        this.parution = paru;
        this.time = time;

    }

    @Override
    public String toString() {
        return
                "Titre='" + title + '\'' +
                        ", Realisateur= " + rea +
                        ", Sortie=" + parution +
                        ", Temps =" + time + "p "+ "\n";
    }

    public String getTitle() { return title;}

    public void setTitle(String title) {this.title = title;
    }

    public Realisateur getRea() {return rea;}

    public void setRea(Realisateur rea) {this.rea = rea;}

    public short getParution() {return parution;}

    public void setParution(short parution) {this.parution = parution;    }

    public double getTime() {return time;}

    public void setTime(double time) {this.time = time;}
}
