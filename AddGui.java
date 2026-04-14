import java.awt.*;
import javax.swing.*;
public class AddGui {
    public static void main(String[] args){
        Addition a=new Addition();
    }
}
class Addition extends JFrame {
    public Addition() {
        JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);
        JButton b=new JButton("Add");
        JLabel l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l); 

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}