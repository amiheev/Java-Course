package BallPaint;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleFrameTest {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGui();
            }
        });
    }

    static public void createGui() {
        SimpleFrame ourFrame = new SimpleFrame("Another title");
        ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ourFrame.setVisible(true);

    }

}

class SimpleFrame extends JFrame {

    private String title = "Default title";

    JPanel panel;




    private void constructFrame() {
        setTitle(title);

        setSize(800, 600);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        setLocation((int) width / 2 - getWidth() / 2, (int) height / 2
                - getHeight() / 2);
        setResizable(true);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        panel.setBackground(Color.WHITE);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e){
                if (e.getX() > 755 && e.getY() < 50) {
                    new BallThread(panel, e.getX()-50, e.getY() + 50).start();
                    repaint();
                }else if (e.getX() > 755 && e.getY() > 525){
                    new BallThread(panel, e.getX()-55, e.getY()-55).start();
                    repaint();
                }else if (e.getX() < 50 && e.getY() < 50){
                    new BallThread(panel, e.getX()+65, e.getY()+ 65).start();
                    repaint();
                }else if (e.getX() < 50 && e.getY() > 550){
                    new BallThread(panel, e.getX()+55, e.getY()-55).start();
                    repaint();
                }else if (e.getX() < 50){
                    new BallThread(panel, e.getX()+65, e.getY()).start();
                    repaint();
                }else if (e.getX() >  750){
                    new BallThread(panel, e.getX()+-55, e.getY()).start();
                    repaint();
                }else if (e.getY() > 550){
                    new BallThread(panel, e.getX(), e.getY()-55).start();
                    repaint();
                }else if (e.getY() < 50){
                    new BallThread(panel, e.getX(), e.getY()+55).start();
                    repaint();
                }else  {
                    new BallThread(panel, e.getX(), e.getY()).start();
                    repaint();
            }
                System.out.println("X - " + e.getX() + " ,y - " +e.getY());
        }});

        this.add(panel, BorderLayout.CENTER);
    }

    SimpleFrame() {
        super();
        constructFrame();

    }

    SimpleFrame(String t) {
        super();

        title = t;
        constructFrame();
    }


}

class BallThread extends Thread {
    JPanel panel;
    private int posX, posY;
    int posX1 = 1;
    int posY1 = 1;



    BallThread(JPanel p, int posX, int posY) {
        this.panel = p;
        this.posX = posX;
        this.posY = posY;
    }

    public void run() {

        while(true) {
            posX += posX1;
            posY += posY1 ;
            if (posX == 806-55 || posX ==34){
                posX1=-posX1;
                panel.repaint();

            }
            if (posY == 584-55 || posY==34){
                posY1=-posY1;
                panel.repaint();

            }
            paint(panel.getGraphics());
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawOval(posX - 25-posX1, posY - 25 -posY1, 50, 50);
        g.setColor(Color.BLACK);
        g.drawOval(posX - 25, posY - 25, 50, 50);

    }
}

