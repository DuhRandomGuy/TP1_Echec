import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPartie extends JDialog{
    private JLabel title;
    private JPanel menuPartiePanel;

    public MenuPartie(JFrame parent) {
        super(parent);
        setTitle("Menu partie");
        setContentPane(menuPartiePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
