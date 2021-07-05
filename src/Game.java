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
        try {
            source = loadImage();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, h, BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            System.err.println("Problem this source image " + ex);
        }
    }

    public BufferedImage resizeImage (BufferedImage originImage, int width, int height, int type) {
        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }

    public BufferedImage loadImage() throws IOException {
        BufferedImage bimg = ImageIO.read(new File("scale_1200.jpg"));
        return bimg;
    }

    public int getNewHeight (int w, int h) {
        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }
}
