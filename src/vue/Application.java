package vue;

import model.*;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    //Application avec SWING démarrage

    public Application(){

        this.setTitle("Bibliothèque");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(1000,500));


        JPanel gauche = new JPanel();
        JPanel droit = new JPanel();


        JPanel thepanel = new JPanel();




        this.setContentPane(thepanel);
        this.setVisible(true);

    }




    public static void main(String[] args){


       //Application laVue = new Application();

        Auteur moi = new Auteur("Maxime","Guigourez",1998);
        System.out.println(moi.toString());
        Auteur simon = new Auteur("Simon","Gautier",1998);
        System.out.println(simon.toString());


    }


}
