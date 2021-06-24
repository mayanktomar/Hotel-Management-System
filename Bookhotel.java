import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Bookhotel
{

  Bookhotel(String st1)throws IOException
  {
    JFrame f2= new JFrame("Book your hotel");
    JLabel l1,l2,l3,l4;
    // l5=new JLabel("Age should be greater than or equal to 18");
    // l5.setBounds(50,310,200,50);
    JButton bt1;
    l1=new JLabel("Name");
    l1.setBounds(10,50,100,20);
    l2=new JLabel("Age(>17)");
    l2.setBounds(10,100,100,20);
    l3=new JLabel("Phone number");
    l3.setBounds(10,150,100,20);
    l4=new JLabel("Number of rooms");
    l4.setBounds(10,200,100,20);

    JTextField t1,t2,t3,t4;

    t1=new JTextField();
    t1.setBounds(150,50,200,20);
    t2=new JTextField();
    t2.setBounds(150,100,150,20);
    t3=new JTextField();
    t3.setBounds(150,150,150,20);
    t4=new JTextField();
    t4.setBounds(150,200,150,20);
    bt1=new JButton("Book");
    bt1.setBounds(50,250,100,50);
    bt1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
          try{
            if (Integer.parseInt(t2.getText())<18)
            {
              throw new ArithmeticException("Invalid age");



            }
            f2.dispose();
            new Bookconfirm(st1);
            new Addbooking(st1,t1.getText(),t2.getText(),t3.getText(),t4.getText());
          }
          catch (Exception ee1){
            System.out.println (ee1);
          }

        }});


    f2.add(l1); f2.add(l2); f2.add(l3); f2.add(l4);
    f2.add(t1); f2.add(t2); f2.add(t3); f2.add(t4);
    f2.add(bt1);

    f2.setSize(1000,600);
    f2.setLayout(null);
    f2.setVisible(true);

  }

}
