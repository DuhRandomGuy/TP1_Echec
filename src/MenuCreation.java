import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MenuCreation extends JDialog{
    private JPanel menuPuzzlePanel;
    private JButton pionW;
    private JButton roiW;
    private JButton queenW;
    private JButton tourW;
    private JButton fouW;
    private JButton cavalierW;
    private JButton roiB;
    private JButton queenB;
    private JButton tourB;
    private JButton pionB;
    private JButton fouB;
    private JButton cavalierB;
    private JButton wa8;
    private JButton ba1;
    private JButton wa2;
    private JButton ba3;
    private JButton wa4;
    private JButton ba5;
    private JButton wa6;
    private JButton ba7;
    private JButton bb8;
    private JButton wb7;
    private JButton bb6;
    private JButton wb5;
    private JButton bb4;
    private JButton wb3;
    private JButton bb2;
    private JButton wb1;
    private JButton wc8;
    private JButton bc7;
    private JButton wc6;
    private JButton bc5;
    private JButton wc4;
    private JButton bc3;
    private JButton wc2;
    private JButton bc1;
    private JButton bd8;
    private JButton wd7;
    private JButton bd6;
    private JButton wd5;
    private JButton bd4;
    private JButton wd3;
    private JButton bd2;
    private JButton wd1;
    private JButton we8;
    private JButton be7;
    private JButton we6;
    private JButton be5;
    private JButton we4;
    private JButton be3;
    private JButton we2;
    private JButton be1;
    private JButton bf8;
    private JButton wf7;
    private JButton bf6;
    private JButton wf5;
    private JButton bf4;
    private JButton wf3;
    private JButton bf2;
    private JButton wf1;
    private JButton wg8;
    private JButton bg7;
    private JButton wg6;
    private JButton bg5;
    private JButton wg4;
    private JButton bg3;
    private JButton wg2;
    private JButton bg1;
    private JButton bh8;
    private JButton wh7;
    private JButton bh6;
    private JButton wh5;
    private JButton bh4;
    private JButton wh3;
    private JButton bh2;
    private JButton wh1;
    private JTextArea veuillezChoisirUnDesTextArea;
    private JButton Enregistrer;

    private String selected = "z";


    public MenuCreation(JFrame parent) {
        super(parent);
        setTitle("Menu puzzle");
        setContentPane(menuPuzzlePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
        ActionListener listener = new ActionListener() {
            /* Listener pour tous les boutons*/
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    String name = ((JButton) e.getSource()).getName();
                    if (name.charAt(0) == 'b' || name.charAt(0) == 'w') { //bouton de case
                        if (((JButton) e.getSource()).getIcon().toString() == "b.jpg" || ((JButton) e.getSource()).getIcon().toString() == "w.jpg") { //Verifie si case vide
                        }else{      //si case non vide et reselectionner elle doit etre vider
                            String path = "Graphics/" + name.charAt(0) + ".jpg";

                            ((JButton) e.getSource()).setIcon(new ImageIcon(path));
                        }

                        if (!selected.equals("z")) { //Verifie qu'il y a eu une selection
                            String path = "Graphics/" + name.charAt(0) + selected+".jpg";

                            ((JButton) e.getSource()).setIcon(new ImageIcon(path)); // switch icon quand selection est fait
                        }
                    }



                    if (name.charAt(0) == 'E') { //enregistrement

                    /*Enregistrement ici*/
                    } else {
                        /*Arrange selected pour que elle aille la bonne icon a switcher*/
                        char a = name.charAt(0);
                        char b = name.charAt(-1);
                        selected = String.valueOf(a + b);

                    }

                    }
                }

        };
    }
}
