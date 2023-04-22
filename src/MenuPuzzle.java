import javax.swing.*;
import java.awt.*;

public class MenuPuzzle extends JDialog{
    private JLabel title;
    private JPanel menuPuzzlePanel;

    public MenuPuzzle(JFrame parent) {
        super(parent);
        setTitle("Menu partie");
        setContentPane(menuPuzzlePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
