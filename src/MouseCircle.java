import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*<applet code="MouseCircle.class" width="400" height="400"></applet>*/

public class MouseCircle extends Applet implements MouseListener{

    public MouseCircle(){
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int rx=e.getX();
        int ry=e.getY();
        Graphics g=getGraphics();
        g.setColor(Color.blue);
        g.fillOval(rx-15,ry-15,30,30);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String [] args){
        MouseCircle mc=new MouseCircle();
    }
}
