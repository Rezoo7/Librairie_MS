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


        Application laVue = new Application();

    }


}
