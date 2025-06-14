import java.applet.Applet;
import java.awt.Graphics;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;

public class p37 extends Applet {

    public void paint(Graphics g) {
        String message;
        // getCodeBase() method gets the base URL of the directory in which contains this applet.
        URL appletCodeDir = getCodeBase();
        message = "Code Base : " + appletCodeDir.toString();
        g.drawString(message, 10, 90);

        // getDocumentBase() Returns an absolute URL of the Document
        URL appletDocDir = getDocumentBase();
        message = "Document Base : " + appletDocDir.toString();
        g.drawString(message, 10, 120);
        g.drawString("http://ecomputernotes.com", 200, 250);

    }
}