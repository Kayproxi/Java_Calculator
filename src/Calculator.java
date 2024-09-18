import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField field;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, delButton, clrButton, equButton;
    JPanel panel;
    private Object font;
    Font myfont = new Font("Gigi",Font.BOLD, 30);
    double num1 =0, num2=0, result = 0;
    char operator;
     Calculator(){
          frame = new JFrame("Calculator");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(420,550);
          frame.setLayout(null);

          field = new JTextField();
          field.setBounds(50,25,300,50);
          field.setFont(myfont);
          field.setEditable(false);

          addButton = new JButton("+");
          subButton = new JButton("-");
          mulButton = new JButton("*");
          decButton = new JButton(".");
          clrButton = new JButton("clr");
          delButton = new JButton("del");
          equButton = new JButton("=");
          divButton = new JButton("/");

          functionButtons[0] = addButton;
          functionButtons[1] = subButton;
          functionButtons[2] = mulButton;
          functionButtons[3] = divButton;
          functionButtons[4] = delButton;
          functionButtons[5] = clrButton;
          functionButtons[6] = decButton;
          functionButtons[7] = equButton;

          for( int i=0; i<8; i++){
              functionButtons[i].addActionListener(this);
              functionButtons[i].setFont(myfont);
              functionButtons[i].setFocusable(false);
          }

         for( int i=0; i<10; i++){
             numberButtons[i] = new JButton(String.valueOf(i));
             numberButtons[i].addActionListener(this);
             numberButtons[i].setFont(myfont);
             numberButtons[i].setFocusable(false);
         }

         delButton.setBounds(50,430,145,50);
         clrButton.setBounds(205,430,145,50);

         panel = new JPanel();
         panel.setBounds(50,100,300,300);
         panel.setLayout(new GridLayout(4,4,10,10));
         panel.setBackground(Color.BLUE);

         panel.add(numberButtons[0]);
         panel.add(numberButtons[1]);
         panel.add(numberButtons[2]);
         panel.add(functionButtons[0]);
         panel.add(numberButtons[3]);
         panel.add(numberButtons[4]);
         panel.add(numberButtons[5]);
         panel.add(functionButtons[1]);
         panel.add(numberButtons[6]);
         panel.add(numberButtons[8]);
         panel.add(numberButtons[9]);
         panel.add(functionButtons[2]);
         panel.add(functionButtons[3]);
         panel.add(functionButtons[4]);
         panel.add(functionButtons[5]);
         panel.add(functionButtons[6]);
         panel.add(functionButtons[7]);



          frame.add(panel);
          frame.add(delButton);
          frame.add(clrButton);
          frame.add(field);
          frame.setVisible(true);

     }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}