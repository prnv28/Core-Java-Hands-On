import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseApplet extends Applet implements MouseListener {

    Label l;

    public MouseApplet(){
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked.......");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed.......");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released......");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered.......");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited........");
    }

    public static void main(String [] args){
        MouseApplet mp=new MouseApplet();
    }
}
