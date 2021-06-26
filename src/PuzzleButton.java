import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PuzzleButton extends JButton {

    private boolean isLasButton;

    public PuzzleButton() {
        super();
        initUI();
    }

    public PuzzleButton(Image i) {
        super(new ImageIcon(i));
        initUI();
    }

    private void initUI() {
        isLasButton = false;

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }

    public boolean isLasButton(){
        return isLasButton;
    }

    public void setLastButton (boolean isLastButton) {
        this.isLasButton = isLastButton;
    }
}
