import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Managebook
{
  Managebook()throws IOException
  { boolean flag=false;
    String s;
    String sm;
    JFrame f4=new JFrame("View your booking");
    JLabel lm1=new JLabel("Enter your name");
    JButton bm=new JButton("Search");

    lm1.setBounds(10,50,100,20);
    bm.setBounds(350,50,100,20);

    JTextField tm1;
    tm1=new JTextField();
    tm1.setBounds(150,50,200,20);
    f4.add(lm1);
    f4.add(tm1);
    f4.add(bm);

    bm.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ee1){
          try{
            new Booksearch(tm1.getText());
          }
          catch (IOException ee){
            System.out.println (ee);
          }
        }});

  f4.setSize(700,300);
  f4.setLayout(null);
  f4.setVisible(true);

}}
