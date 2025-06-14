import javax.swing.*;
import java.awt.*;

public class MovingBanner extends JFrame implements Runnable {

    String msg = " It is a moving Banner. ";
    char cha;
    boolean stopFlag = false;
    Thread t = null;

    public MovingBanner() {
        setTitle("Moving Banner");
        setSize(800, 800); // Ensure the size is big enough for the message
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centers the window
    }

    public void startBanner() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    @Override
    public void run() {
        while (!stopFlag) {
            try {
                repaint(); // Repaint the frame to update the banner
                Thread.sleep(250); // Delay for 250 milliseconds

                // Moving the first character to the end of the string
                cha = msg.charAt(0);
                msg = msg.substring(1); // Remove the first character
                msg = msg + cha; // Append the character to the end

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopBanner() {
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass paint method
        g.drawString(msg, 60, 30); // Draw the updated message
    }

    public static void main(String[] args) {
        // Create the banner frame and display it
        MovingBanner banner = new MovingBanner();
        banner.setVisible(true);
        banner.startBanner(); // Start the moving banner thread
    }
}
