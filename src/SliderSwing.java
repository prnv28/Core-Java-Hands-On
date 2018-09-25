import javax.swing.*;

public class SliderSwing extends JFrame{
    JFrame frame;
    public SliderSwing(){
        frame=new JFrame();
        JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,10);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel=new JPanel();
        panel.setBounds(20,20,200,200);
        panel.add(slider);
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);
    }

    public static void main(String [] args){
        SliderSwing ss=new SliderSwing();
    }
}
