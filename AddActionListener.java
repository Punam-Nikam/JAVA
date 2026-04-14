import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

public class AddActionListener {
    
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

        setLayout(new FlowLayout());

        add(t1);
        add(t2);
        add(b);
        add(l);

        ActionListener al=new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                //get text from textfields, convert to integer, add them and set the result to label

                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                l.setText("Result: "+sum);
                }
        };
        b.addActionListener(al); //ActionListener is an interface, so we cannot create its object directly here we have 2 ways to implement it.
        //1. Create a class that implements ActionListener interface and override its method actionPerformed()
        //2. Use Anonymous Inner Class to implement ActionListener interface and override its method actionPerformed()  

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}


