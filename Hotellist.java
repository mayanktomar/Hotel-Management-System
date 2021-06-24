import java.util.*;
import java.io.*;
public class Hotellist

{
  int n=0;
   Hotellist()throws IOException
  {
  String s1="";
  int c=0;
  BufferedReader b1=new BufferedReader(new FileReader("hlist.txt"));

   while ((s1=b1.readLine())!=null) {
     c++;
   }
  n=c/3;

  }}
