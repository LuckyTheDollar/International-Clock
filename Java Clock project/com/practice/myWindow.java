package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class myWindow extends JFrame
{
    private JLabel heading, heading2;

    private JLabel clockLabel;

    private Font font = new Font("", Font.BOLD, 35);




    {
        super.setTitle("International Clock");
        super.setSize(550,500);
        super.setLocation(500,55);
        this.createGUI();
        this.startClock();
        super.setVisible(true);

    }


    public void createGUI() {

        heading = new JLabel("Country Clock ");
        heading2 = new JLabel("© 2024 Lukman Ali ");
        clockLabel = new JLabel("United Kingdom");
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);

        this.setLayout(new GridLayout(3,1));
        this.add(heading2);
        this.add(clockLabel);


    }

    public void startClock(){

        Timer time = new Timer(1000, new ActionListener()

        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLabel.setText(dateTime);

            }
        });

            time.start();
    }


}

