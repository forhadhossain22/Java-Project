import javax.swing.*;

import javax.swing.border.Border;

import javax.swing.BorderFactory;

import java.awt.*;

import java.awt.event.*;

public class Main implements ActionListener{

    JFrame frame;

    JTextField textfield;

    JButton[] numButton = new JButton [10];

    JButton[] funcButton = new JButton [9];

    JButton button = new JButton("Round Button");

    JButton add,sub,multi,divi,equals;

    JButton dot,reset,percent,plusminus;

    JPanel panel;

    Font myFont1 = new Font("SF Pro",Font.PLAIN,63);

    Font myFont2 = new Font("SF Pro",Font.PLAIN,22);

    double num1=0,num2=0,result=0;

    char operator;

    Main(){

        Border border = BorderFactory.createLineBorder(Color.black);

        frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(340, 600);

        frame.setLayout(null);

        frame.getContentPane().setBackground(Color.black);

        frame.setResizable(false);

        textfield = new JTextField();

        textfield.setBounds(30, 100, 280,70);

        textfield.setHorizontalAlignment(SwingConstants.RIGHT);

        textfield.setFont(myFont1);

        textfield.setBackground(Color.black);

        textfield.setForeground(Color.white);

        textfield.setBorder(border);

        textfield.setEditable(true);

        add = new JButton("+");

        sub = new JButton("-");

        divi = new JButton("÷");

        multi = new JButton("x");

        equals = new JButton("=");

        dot = new JButton(".");

        reset = new JButton("AC");

        percent = new JButton("%");

        plusminus = new JButton("+/-");

        funcButton[0] = add;

        funcButton[1] = sub;

        funcButton[2] = divi;

        funcButton[3] = multi;

        funcButton[4] = equals;

        funcButton[5] = dot;

        funcButton[6] = reset;

        funcButton[7] = percent;

        funcButton[8] = plusminus;

        for(int i = 0; i < 9; i++) {

            funcButton[i].addActionListener(this);

            funcButton[i].setFont(myFont2);

            funcButton[i].setFocusable(false);

        }

        for(int i = 0; i < 10; i++) {

            numButton[i]= new JButton(String.valueOf(i));

            numButton[i].addActionListener(this);

            numButton[i].setFont(myFont2);

            numButton[i].setFocusable(false);

        }

        panel = new JPanel();

        panel.setBounds(20,174,304,370);

        panel.setLayout(new GridLayout(5,4,10,10));

        panel.setBackground(Color.black);

        panel.add(reset);

        panel.add(plusminus);

        panel.add(percent);

        panel.add(divi);

        panel.add(numButton[7]);

        panel.add(numButton[8]);

        panel.add(numButton[9]);

        panel.add(multi);

        panel.add(numButton[4]);

        panel.add(numButton[5]);

        panel.add(numButton[6]);

        panel.add(sub);

        panel.add(numButton[1]);

        panel.add(numButton[2]);

        panel.add(numButton[3]);

        panel.add(add);

        panel.add(numButton[0]);

        panel.add(dot);

        panel.add(equals);

        frame.add(panel);

        frame.add(textfield);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Main calc = new Main();

    }

    public void actionPerformed(ActionEvent e) {

    }

}