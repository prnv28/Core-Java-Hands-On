import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSwing extends JFrame implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectall;
    JTextArea ta;

    public MenuSwing(){
        f=new JFrame();
        ta=new JTextArea();
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectall=new JMenuItem("Select All");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);

        ta.setBounds(5,5,500,500);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        f.add(mb);
        f.add(ta);

        f.setJMenuBar(mb);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut){
            ta.cut();
        }
        if(e.getSource()==copy){
            ta.copy();
        }
        if(e.getSource()==paste){
            ta.paste();
        }
        if(e.getSource()==selectall){
            ta.selectAll();
        }

    }
    public static void main(String [] args){
        MenuSwing ms=new MenuSwing();
    }
}
