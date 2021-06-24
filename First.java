import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class First {
First()throws IOException {
          JFrame f= new JFrame("Hotel Booking System");
        JLabel l1,l2;
        l1=new JLabel("One stop to find your dream hotel..!!!");
        l1.setBounds(10,10,250,25);
        JButton b=new JButton("Search hotel");
        b.setBounds(10,80,175,40);
        JButton b1=new JButton("View your booking");
        b1.setBounds(10,130,175,40);
        JButton b2=new JButton("Add new hotel");
        b2.setBounds(10,180,175,40);

        ImageIcon image = new ImageIcon("homeimg2.jpg");
        JLabel label = new JLabel(image);
        label.setBounds(180,-50,600,400);
        b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
              try{
                new Hoteldisplay();
              }
              catch (IOException ee){
                System.out.println (ee);
              }
            }});
            b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ee1){
                  try{
                    new Managebook();
                  }
                  catch (IOException ee){
                    System.out.println (ee);
                  }
                }});
                b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                      try{
                        new Addhotel();
                      }
                      catch (IOException ee){
                        System.out.println (ee);
                      }
                    }});
        
        f.add(l1); f.add(b); f.add(b1); f.add(b2);  f.add(label);
        f.setSize(700,300);
        f.setLayout(null);
        f.setVisible(true);

}
}
