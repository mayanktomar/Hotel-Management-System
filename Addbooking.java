import java.io.*;
import java.util.*;

public class Addbooking
{

  Addbooking(String s1, String s2, String s3, String s4, String s5)throws IOException
  {
    FileWriter fw=new FileWriter(s1+".txt",true);
          fw.write(s2);
          fw.write("\n");
          fw.write(s5);
          fw.write("\n");
          fw.write(s4);
          fw.write("\n");
          fw.write(s3);
          fw.write("\n");
          fw.write("#");
          fw.write("\n");
          fw.close();

          FileWriter fw1=new FileWriter("bookinglist.txt",true);
                fw1.write(s2);
                fw1.write("\n");
                fw1.write(s1);
                fw1.write("\n");
                fw1.write(s5);
                fw1.write("\n");
                fw1.write(s4);
                fw1.write("\n");
                fw1.write(s3);
                fw1.write("\n");
                fw1.write("#");
                fw1.write("\n");
                fw1.close();

  }
}
