import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet
{
     public void paint(Graphics g)
     {
          g.drawString("Welcome to Java Applet", 50, 150);
      }    
}

/*
<applet code="FirstApplet.class" width="400" height="400"> </applet>
*/
