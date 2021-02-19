package com.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame{
    //This class is the main landing page.
    private static JFrame f;
    private static JButton b;
    private static JButton s;
    private static JLabel l;
    private static JTextField tf;
    float sum = 0;



    public static void main(String[] args) {
        Home home = new Home();
        home.start();
    }

    public void start() {
        f = new JFrame("Java Budget Tracker");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //BEGIN

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel(new GridBagLayout());
        JPanel txtPanel = new JPanel(new GridLayout());
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints titleC = new GridBagConstraints();
        GridBagConstraints buttonC = new GridBagConstraints();
        l = new JLabel("Input total in: \n\n" + Float.toString(sum) + "\n");
        titleC.gridx = 0;
        titleC.gridy = 0;
        titlePanel.add(l, titleC);
        tf = new JTextField("enter number value");
        txtPanel.add(tf);

        b = new JButton("+ number");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float sumIn = sum;
                String tftxt = tf.getText();
                functions ft = new functions();
                if (ft.isNum(tftxt)){
                    sumIn += Float.parseFloat(tftxt);
                    sum = sumIn;
                    System.out.println(sumIn);
                    l.setText("Input total in: \n\n" + Float.toString(sum) + "\n");
                    f.revalidate();
                    f.repaint();
                }
                else {
                    l.setText("NOT A NUMBER. PLEASE TRY AGAIN.");
                    f.revalidate();
                    f.repaint();
                }
            }
        });
        buttonC.insets = new Insets(10, 0, 0, 0);
        buttonC.gridx = 0;
        buttonC.gridy = 0;
        buttonPanel.add(b, buttonC);

        s = new JButton("- number");
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float sumIn = sum;
                String tftxt = tf.getText();
                functions ft = new functions();
                if (ft.isNum(tftxt)){
                    sumIn -= Float.parseFloat(tftxt);
                    sum = sumIn;
                    System.out.println(sumIn);
                    l.setText("Input total in: \n\n" + Float.toString(sum) + "\n");
                    f.revalidate();
                    f.repaint();
                }
                else {
                    l.setText("NOT A NUMBER. PLEASE TRY AGAIN.");
                    f.revalidate();
                    f.repaint();
                }
            }
        });
        buttonC.insets = new Insets(10, 0, 0, 0);
        buttonC.gridx = 1;
        buttonC.gridy = 0;
        buttonPanel.add(s, buttonC);


        //END
        titlePanel.setBackground(Color.CYAN);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        txtPanel.setBackground(Color.GREEN);
        mainPanel.add(txtPanel, BorderLayout.CENTER);
        buttonPanel.setBackground(Color.RED);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        f.add(mainPanel);
        f.setMinimumSize(new Dimension(250, 250));
        f.setVisible(true);
    }
    
}
