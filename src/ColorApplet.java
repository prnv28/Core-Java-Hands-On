import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorApplet extends Applet implements ActionListener{

    Button submit,reset;
    TextField f1;
    Checkbox c1,c2,c3;
    CheckboxGroup gp;

    public void init(){
        submit=new Button("Submit");
        submit.addActionListener(this);

        reset=new Button("Reset");
        reset.addActionListener(this);

        f1=new TextField(15);
        gp=new CheckboxGroup();

        c1=new Checkbox("Red",false, gp);
        c2=new Checkbox("Blue", false, gp);
        c3=new Checkbox("Green",false, gp);

        add(f1);
        add(c1);
        add(c2);
        add(c3);
        add(submit);
        add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String t1=f1.getText();
            Boolean b1= c1.getState();
            Boolean b2=c2.getState();
            Boolean b3=c3.getState();

            Button k = (Button) e.getSource();
            String label=k.getLabel();

            if(b1){
                f1.setForeground(Color.red);
                f1.setText(t1);
            }
            else if (b2){
                f1.setForeground(Color.blue);
                f1.setText(t1);
            }
            else if (b3){
                f1.setForeground(Color.green);
                f1.setText(t1);
            }
            if(label=="Reset"){
                f1.setForeground(Color.black);
                f1.setText(t1);
//                Checkbox current = gp.getCurrent();
//                gp.setCurrent( null );
//                current.setState( false );
                gp.setCurrent(null);
                gp.getCurrent().setState(false);
            }
        }
        catch (Exception e1){
            System.out.println("Exception Occurs!!!");
        }
    }
}
