import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Game extends JFrame {
    private ArrayList<Point> solution;
    private ArrayList<PuzzleButton> buttons;
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
        int row = 3;
        int col = 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                solution.add(new Point(row, col ));
            }
        }
        buttons = new ArrayList<>();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setLayout(new GridLayout(4,3));
    }

    public BufferedImage loadImage() throws IOException {
        BufferedImage bimg = ImageIO.read(new File("scale_1200.jpg"));
        return bimg;
    }
}
