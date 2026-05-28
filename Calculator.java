import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    
    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());
        
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };
        
        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }
        
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } 
        else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
        }
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 != 0) result = num1 / num2;
                    else display.setText("Error");
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
        }
        else { // operator pressed
            operator = command.charAt(0);
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}