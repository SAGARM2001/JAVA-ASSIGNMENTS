import java.awt.*;

class Circle extends Frame implements Runnable {
    private Thread t;
    private int x = 100;
    private int direction = 1; 

    public Circle() {
        t = new Thread(this,"t");
        t.start();
    }

    public void run() {
        while (true) {
            x = x+direction; 
            if (x <= 0 || x >= getWidth() - 50) {
                direction = direction*-1;
            }

            repaint();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, 100, 50, 50); //x ghetla bcz to change honar ahe mhnun variable ghetla baki constant
    }
}

public class Tester {
    public static void main(String[] args) {
        Circle circleFrame = new Circle();
        circleFrame.setSize(400, 300);
        circleFrame.setVisible(true);
    }
}
