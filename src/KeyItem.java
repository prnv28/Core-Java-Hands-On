import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyItem extends Frame implements KeyListener{

    Label l;
    public KeyItem(){
        l=new Label();
        addKeyListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        l.setBounds(30,30,100,100);
        add(l);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='a'){
            l.setText("a for Apple");
        }
        else if(e.getKeyChar()=='e'){
            l.setText("e for Elephant");
        }
        else if(e.getKeyChar()=='i'){
            l.setText("i for Ipad");
        }
        else if(e.getKeyChar()=='o'){
            l.setText("o for Oracle");
        }
        else if(e.getKeyChar()=='u'){
            l.setText("u for Ubuntu");
        }
        else{
            l.setText("Wrong Key");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String [] args){
        KeyItem ki=new KeyItem();
    }
}
