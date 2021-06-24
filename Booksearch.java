import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Booksearch extends Managebook
{
  Booksearch(String sm)throws IOException
  { boolean flag=false;
    String s;
     JFrame f5=new JFrame("Your booking");
    JLabel lm1,lm2,lm3;
    lm1=new JLabel("Name");
    lm1.setBounds(10,50,100,20);
    lm2=new JLabel("Hotel");
    lm2.setBounds(10,100,100,20);
    lm3=new JLabel("Number of rooms");
    f5.add(lm1); f5.add(lm2); f5.add(lm3);
    System.out.println(sm);
    JLabel lm4,lm5,lm6;
    lm3.setBounds(10,150,100,20);
    BufferedReader br=new BufferedReader(new FileReader("bookinglist.txt"));
     while((s=br.readLine())!=null) {
       if (s.equalsIgnoreCase(sm)==true)
       { System.out.println("found");
         lm4=new JLabel(sm);
         lm4.setBounds(150,50,200,20);
         lm5=new JLabel(br.readLine());
         lm5.setBounds(150,100,150,20);
         lm6=new JLabel(br.readLine());
         lm6.setBounds(150,150,150,20);

         f5.add(lm4); f5.add(lm5); f5.add(lm6);
         flag=true;
         break;
       }

  }
  if (flag==false)
  { System.out.println ("not found");
  lm5=new JLabel("No booking found");
  lm5.setBounds(150,100,150,20);}
  f5.setSize(700,300);
  f5.setLayout(null);
  f5.setVisible(true);

  }
}
