import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingBlock extends JPanel implements KeyListener {

    private int x = 100, y = 100;
    private final int size = 50;
    private final int speed = 5;

    public MovingBlock() {
        JFrame frame = new JFrame("Moving Block");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        frame.addKeyListener(this);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, size, size);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) y -= speed;
        if (key == KeyEvent.VK_S) y += speed;
        if (key == KeyEvent.VK_A) x -= speed;
        if (key == KeyEvent.VK_D) x += speed;

        repaint();
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new MovingBlock();
    }
}
