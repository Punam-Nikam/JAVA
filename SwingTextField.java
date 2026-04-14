
import java.awt.*;
import javax.swing.*;

public class SwingTextField {
    public static void main(String[] args) {
        JFrame f=new JFrame();
    
        JLabel l1=new JLabel("First Number");
        JTextField t1=new JTextField(20);

        JLabel l2=new JLabel("Second Number");
        JTextField t2=new JTextField(20);
        JButton b=new JButton("ok");
        JLabel l=new JLabel("Result");

        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(l);

        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}