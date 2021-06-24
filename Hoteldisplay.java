import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Hoteldisplay extends Hotellist {
  int i=0;
  int c1=25;
  int c2=0;
  String s="";
  FileInputStream fis=null;
  Hotellist obc=new Hotellist();

Hoteldisplay()throws IOException {

          JFrame f1= new JFrame("Find your hotel");
          JLabel name=new JLabel("Name");
          name.setBounds(10,5,150,10);
          JLabel co=new JLabel("Cost");
          co.setBounds(220,5,150,10);
          JLabel rat=new JLabel("Rating");
          rat.setBounds(260,0,150,20);

          f1.add(name); f1.add(co); f1.add(rat);
          JLabel ld1[]=new JLabel[n];
          JLabel ld2[]=new JLabel[n];
          JLabel ld3[]=new JLabel[n];

          JButton ld4[]=new JButton[n];



                BufferedReader b=new BufferedReader(new FileReader("hlist.txt"));

                 while((s=b.readLine())!=null) {

                   ld1[c2]=new JLabel(s);
                   ld1[c2].setBounds(10,c1,200,50);


                   ld4[c2]=new JButton("Book");
                   ld4[c2].addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        try{
                          for(int i = 0 ; i < n ; i++)
                          {
                            if(e.getSource() == ld4[i])
                            new Bookhotel(ld1[i].getText());
                          }
                          f1.dispose();

                        }
                        catch (Exception ee1){
                          System.out.println (ee1);
                        }
                      }});


                   ld4[c2].setBounds(300,(c1+12),175,20);


                   s=b.readLine();
                   ld2[c2]=new JLabel(s);
                   ld2[c2].setBounds(220,c1,50,50);
                   s=b.readLine();
                   ld3[c2]=new JLabel(s);
                   ld3[c2].setBounds(260,c1,25,50);

                   f1.add(ld1[c2]); f1.add(ld2[c2]); f1.add(ld3[c2]);  f1.add(ld4[c2]);

                  c1=c1+20;
                  c2++;
                }



          f1.setSize(700,300);
          f1.setLayout(null);
          f1.setVisible(true);

}}
