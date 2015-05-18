package view;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc277043 on 18/05/15.
 */
public class Mainframe extends JFrame implements ActionListener{
private JPanel centerPanel;
    public Mainframe(){
        //general setup
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        // centre panel for jpanel
        centerPanel =new JPanel();
        centerPanel.setPreferredSize(new Dimension(400,400));
// define the central panel to conatain to subpanel
        centerPanel.setLayout(new GridLayout(1,2));
        JPanel leftPanel =new JPanel();
        JPanel rightPanel =new JPanel();
        centerPanel.add(leftPanel);gfhf
        centerPanel.add(rightPanel);
        //define a border to the left subPanel
        leftPanel.setBorder(BorderFactory.createEtchedBorder());
        leftPanel.setBackground(new Color(0,0,0,0));
        JButton jButton1=new JButton("one");
        JButton jButton2=new JButton("two");
        JButton jButton3=new JButton("three");
        leftPanel.add(jButton1);
        leftPanel.add(jButton2);
        leftPanel.add(jButton3);

rightPanel.setLayout(new BorderLayout());
        JButton east=new JButton("east");
        JButton west=new JButton("west");
        JButton centre=new JButton("centre");
       rightPanel.add(new JButton("north"), BorderLayout.NORTH);
      rightPanel.add(new JButton("south"), BorderLayout.SOUTH);
        rightPanel.add(east,BorderLayout.EAST);
        rightPanel.add(west,BorderLayout.WEST);
        rightPanel.add(centre,BorderLayout.CENTER);
        add(centerPanel);
        // menubar to the frame
        JMenuBar menuBars=new JMenuBar();
        setJMenuBar(menuBars);
// add menubar to fram e
        JMenu jMenu= new JMenu("Colours");
        menuBars.add(jMenu);
        // setup the menu items for the colours menu
        JMenuItem redMenu =new JMenuItem("red");
        jMenu.add(redMenu );
        JMenuItem blueMenu =new JMenuItem("blue");
        jMenu.add(blueMenu );
        JMenuItem greenMenu =new JMenuItem("green");
        jMenu.add(greenMenu );
        for (int i = 0; i <jMenu.getItemCount(); i++) {
            jMenu.getItem(i).addActionListener(this);
    }




     //generalSetup
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem menuitem =(JMenuItem) e.getSource();
        String colour = menuitem.getText();
        System.out.println(menuitem);
      switch(colour)
      {
          case "red":
              centerPanel.setBackground(Color.red);
              break;
          case "blue":
              centerPanel.setBackground(Color.blue);
              break;
          case "green":
              centerPanel.setBackground(Color.GREEN);
              break;

    }
}}

