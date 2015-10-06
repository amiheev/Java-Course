package UI;
import java.awt.*;

import java.awt.event.*;

import javax.swing.JApplet;

public class MyKey extends JApplet {

    private String msg = " ";

    private int x = 0, y = 20;

    private Rectangle rect = new Rectangle(20, 20, 100, 60);

    private class AppletMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent me) {
        int x = me.getX();

        int y = me.getY();

        if (rect.contains(x, y)) {

            showStatus("click in blue rectangle");

        } else {

            showStatus(" click in white area ");

        }
        }
        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}
    }


    private class AppletKeyListener implements KeyListener {

        public void keyPressed(KeyEvent e) {

            showStatus("Key Down");

        }

        public void keyReleased(KeyEvent e) {

            showStatus("Key Up");

        }

        public void keyTyped(KeyEvent e) {

            msg += e.getKeyChar();

            repaint();

        }

    }

    public void init() {
        setBackground(Color.WHITE);

        addMouseListener(new AppletMouseListener());
        addKeyListener(new AppletKeyListener());
        setFocusable(true);
        requestFocus();

    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);

        g.fillRect(rect.x, rect.y, rect.width, rect.height);
        g.drawString(msg, x, y);

    }
}
