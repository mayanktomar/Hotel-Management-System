import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Bookconfirm
{
  Bookconfirm(String s)
  {
    JFrame f3=new JFrame("Booking confirmation");
    JLabel lc1=new JLabel("Congratulations, your stay is confirmed in" +s +"hotel..!!");
    lc1.setBounds(50,50,600,50);

    f3.add(lc1);
    f3.setSize(700,300);
    f3.setLayout(null);
    f3.setVisible(true);
  }
}
