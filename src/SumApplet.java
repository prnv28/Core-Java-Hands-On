import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumApplet extends Applet implements ActionListener{
    TextField f1,f2,sum;
    Label l1,l2,l3;

    public void init(){
        f1=new TextField(15);
        l1=new Label("Enter First Number : ");

        f2=new TextField(15);
        l2=new Label("Enter Second Number");

        sum=new TextField(15);
        l3=new Label("Sum : ");

        f2.addActionListener(this);

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(sum);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            String t1=f1.getText();
            String t2=f2.getText();
            int n1=Integer.parseInt(t1);
            int n2=Integer.parseInt(t2);
            int addition=n1+n2;
            sum.setText(" "+addition);
        }
        catch (Exception e1){
            System.out.println("Exception Occurs!!!");
        }
    }
}
