import javax.swing.*;
import java.awt.*;

public class MenuPuzzle extends JDialog{
    private JLabel title;
    private JPanel menuPuzzlePanel;
    private JButton button1;
    private JComboBox comboBox1;

    public MenuPuzzle(JFrame parent) {
        super(parent);
        setTitle("Menu puzzle");
        setContentPane(menuPuzzlePanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
