import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Addhotel
{

  Addhotel()throws IOException
  {
    JFrame f7= new JFrame("Add new hotel");
    JLabel lh1,lh2,lh3,lh4;
    JButton btn1;
    lh1=new JLabel("Name");
    lh1.setBounds(10,50,100,20);
    lh2=new JLabel("Cost");
    lh2.setBounds(10,100,100,20);
    lh3=new JLabel("Rating");
    lh3.setBounds(10,150,100,20);


    JTextField th1,th2,th3,th4;

    th1=new JTextField();
    th1.setBounds(150,50,200,20);
    th2=new JTextField();
    th2.setBounds(150,100,150,20);
    th3=new JTextField();
    th3.setBounds(150,150,150,20);
    th4=new JTextField();
    btn1=new JButton("Add");
    btn1.setBounds(50,250,100,50);
    btn1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

            f7.dispose();
            try
            {
            FileWriter fw2=new FileWriter("hlist.txt",true);
                  fw2.write(th1.getText());
                  fw2.write("\n");
                  fw2.write(th2.getText());
                  fw2.write("\n");
                  fw2.write(th3.getText());
                  fw2.write("\n");
                  fw2.close();
          }
          catch (Exception ee3) {
            System.out.println (ee3);
          }}


        });


    f7.add(lh1); f7.add(lh2); f7.add(lh3);
    f7.add(th1); f7.add(th2); f7.add(th3);
    f7.add(btn1);

    f7.setSize(1000,600);
    f7.setLayout(null);
    f7.setVisible(true);

  }

}
