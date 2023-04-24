import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JDialog {

    //Attributs du menu principal
    private JButton boutonPartie;
    private JButton boutonPuzzle;
    private JLabel icon;
    private JLabel title;
    private JPanel menuPanel;

    //Constructeur du menu principal
    public MenuPrincipal(JFrame parent) {
        super(parent);
        setTitle("Menu principal");
        setContentPane(menuPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);

        //Listener du bouton pour commencer une partie normale
        boutonPartie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Création d'un objet MenuPartie
                MenuPartie menuPartie = new MenuPartie(null);
            }
        });

        //Listener pour commencer un puzzle
        boutonPuzzle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Création d'un objet MenuPuzzle
                MenuPuzzle menuPuzzle = new MenuPuzzle(null);
            }
        });
        setVisible(true);
    }

    public static void main(String[]  args){

        //Création d'un objet MenuPrincipal
        MenuPrincipal menuPrincipal = new MenuPrincipal(null);
    }

}
