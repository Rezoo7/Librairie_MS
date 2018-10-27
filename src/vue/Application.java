package vue;

import model.*;

public class Application {




    public static void main(String[] args){



        Auteur moi = new Auteur("Maxime","Guigourez",1998);
        Livre saucisson = new Livre("Saucisson",moi,2016,100);
        Livre becherelle = new Livre("TheBecherelle",moi,1950,122);
        Livre sciences= new Livre("Sciences",moi,2016,255);
        Livre Life = new Livre("MaVie",moi,2018,1000);

        moi.ajouterLivre(saucisson);
        moi.ajouterLivre(becherelle);
        moi.ajouterLivre(sciences);
        moi.ajouterLivre(Life);


        System.out.println(moi.saListe());

    }


}
