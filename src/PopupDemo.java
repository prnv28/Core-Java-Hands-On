import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class PopupDemo extends JFrame implements MouseListener{

    JTextArea ta;
    public PopupDemo(){
        JFrame f=new JFrame();
        ta=new JTextArea();
        final JPopupMenu popupMenu=new JPopupMenu();

        JMenuItem cut=new JMenuItem("Cut");

        JMenuItem copy=new JMenuItem("Copy");

        JMenuItem paste=new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        f.add(ta);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                popupMenu.show(f,x,y);
            }
        });
    }

    public static void main(String [] args){
        new PopupDemo();
    }




    @Override
    public void mouseClicked(MouseEvent e) {

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
}
