import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotion extends Applet implements MouseMotionListener {

    Label l;

    public MouseMotion(){
        addMouseMotionListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        l.setText("X : "+e.getX()+" Y : "+e.getY());
        g.setColor(Color.red);
        g.fillOval(e.getX()-1,e.getY()-1,2,2);

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("X : "+e.getX()+" Y : "+e.getY());
    }

    public static void main(String [] args){
       MouseMotion mm=new MouseMotion();
    }
}
