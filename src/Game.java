import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JFrame {
    private ArrayList<Point> solution;
    private JPanel panel;
    private BufferedImage source;
    private BufferedImage resized;
    private int width, height;
    private final int DESIRED_WIDTH = 400;

    public Game() {
        initUI();
    }

    public void initUI() {
        solution = new ArrayList<>();
        int line = 3;
        int row = 2;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                solution.add(new Point(line, row ));
            }
        }

    }
}
