//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn savas

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
 public static void main(String args[]) throws IOException
 {
  //add test cases
  Scanner data = new Scanner(new File("mathsetdata.dat")); 
  MathSet test = new MathSet();
  String one, two;
  while(data.hasNextLine()){
    one = data.nextLine();
    two = data.nextLine();
    test = new MathSet(one, two);
    System.out.println(test + "\n \n");
  }
 }
}
