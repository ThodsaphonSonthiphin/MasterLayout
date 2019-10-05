package com.master;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MasterLayoutDrive {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Font bigFont = new Font("serif",Font.BOLD,28);
//
//        JButton button1 = new JButton("NORTH");
//        JButton button2 = new JButton("SOUTH");
//        JButton button3 = new JButton("EAST");
//        JButton button4 = new JButton("NORTH");
//        JButton button5 = new JButton("Center");
//        //button.setFont(bigFont);
//
//        frame.getContentPane().add(BorderLayout.NORTH,button1);
//        frame.getContentPane().add(BorderLayout.SOUTH,button2);
//        frame.getContentPane().add(BorderLayout.EAST,button3);
//        frame.getContentPane().add(BorderLayout.WEST,button4);
//        frame.getContentPane().add(BorderLayout.CENTER,button5);

        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.DARK_GRAY);

        myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton button2 = new JButton("Bliss");


        myPanel.add(button);
        myPanel.add(button2);


        frame.getContentPane().add(BorderLayout.EAST,myPanel);



        JPanel center = new JPanel();

        center.setBackground(Color.YELLOW);

        JLabel myLabel = new JLabel("Something Cool");

        JTextField myTextField = new JTextField(20);
        center.add(myLabel);
        center.add(myTextField);
        frame.getContentPane().add(BorderLayout.CENTER,center);


        JTextArea myTextArea = new JTextArea(10,20);

        JScrollPane myScrollPane = new JScrollPane(myTextArea);

        myScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        myScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        myTextArea.setLineWrap(true);

        center.add(myScrollPane);


        JCheckBox myCheckBox = new JCheckBox("Cool is not it?");

        center.add(myCheckBox);

        MyItemListener listener = new MyItemListener();

        myCheckBox.addItemListener(listener);

        String [] listString = {"Iron man","Captain America", "Thor","Hulk"};

        JList myJlist = new JList(listString);

        myJlist.setVisibleRowCount(2);

        JScrollPane scrollList = new JScrollPane(myJlist);

        scrollList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        center.add(scrollList);








        frame.setVisible(true);
        frame.setSize(500,500);


    }


}
class MyItemListener implements ItemListener {


    public void itemStateChanged(ItemEvent e) {

        System.out.println("Hello world");

    }
}

