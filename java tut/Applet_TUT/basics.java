import java.applet.*;
import java.awt.Graphics;

public class basics extends Applet{
    @Override
    public void paint(Graphics g) 
    {
        g.drawString("Hello World", 20, 20);
    }
}
