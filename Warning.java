import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Warning
{

  Warning()
  {
    JFrame f8= new JFrame("Warning");
    JLabel l5;
    l5=new JLabel("Age should be greater than or equal to 18");
    l5.setBounds(50,10,200,50);

    f8.add(l5);

    f8.setSize(300,300);
    f8.setLayout(null);
    f8.setVisible(true);
}}
