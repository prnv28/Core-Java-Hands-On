import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemExam extends Frame implements ItemListener {
    Checkbox c1,c2,c3;
    CheckboxGroup gp;
    Frame f;

    public ItemExam(){
        gp=new CheckboxGroup();
        f=new Frame("Color");
        c1=new Checkbox("Red",false,gp);
        c2=new Checkbox("Green",false,gp);
        c3=new Checkbox("Blue",false,gp);
        c1.setBounds(10,20,70,50);
        c2.setBounds(10,60,70,50);
        c3.setBounds(10,100,70,50);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Graphics g=getGraphics();
        if(e.getSource()==c1){
            g.setColor(Color.red);
        }
        else if(e.getSource()==c2){
            g.setColor(Color.green);
        }
        else if(e.getSource()==c3){
            g.setColor(Color.blue);
        }
        g.fillOval(100,100,30,30);
    }

    public static void main(String [] args){
        ItemExam ie=new ItemExam();
    }
}
