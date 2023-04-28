import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPuzzle extends JDialog{
    private JLabel title;
    private JPanel menuPuzzlePanel;
    private JButton commencerLePuzzleButton;

    private JComboBox comboBox1;
    private JButton creerPuzzleB;


    public MenuPuzzle(JFrame parent) {
        super(parent);
        setTitle("Menu puzzle");
        setContentPane(menuPuzzlePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);


        creerPuzzleB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Création d'un objet MenuCreation
                MenuCreation menuCreation = new MenuCreation(null);
            }
        });
    }
}
