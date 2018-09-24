import java.applet.Applet;
import java.awt.*;
/*<applet code="MyApplet.class" height="400" width="400"> </applet>*/
public class MyApplet extends Applet{
    public void init(){}
    public void paint(Graphics g){
        g.drawString("Hello world",400,400);
    }
}
