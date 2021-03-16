//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn savas

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
 private Set<Integer> one;
 private Set<Integer> two;

 public MathSet()
 {
   one = new TreeSet<Integer>();
   two = new TreeSet<Integer>();
 }

 public MathSet(String o, String t)
 {
   this();
   for(String i : o.split(" ")){
     int x = Integer.parseInt(i);
     one.add(x);
   }
   for(String i : t.split(" ")){
     int x = Integer.parseInt(i);
     two.add(x);
   }
 }

 public Set<Integer> union()
 {
   Set<Integer> union = new TreeSet<Integer>();
   union.addAll(one);
   union.addAll(two);
  return union;
 }

 public Set<Integer> intersection()
 {
   Set<Integer> intersection = new TreeSet<Integer>();
   intersection.addAll(one);
   intersection.retainAll(two);
   /*THIS IS WHAT CAROLYN DID BUT ITS TOO MUCH
   Set<Integer> intersection = new TreeSet<Integer>();
   Set<Integer> temp = new TreeSet<Integer>();
   for(int i : one)
     if(!temp.add(i))
     intersection.add(i);
   for(int i : two)
     if(!temp.add(i))
     intersection.add(i);*/
  return intersection;
 }

 public Set<Integer> differenceAMinusB()
 {
   Set<Integer> difA = new TreeSet<Integer>();
   difA.addAll(one);
   difA.removeAll(intersection());
  return difA;
 }

 public Set<Integer> differenceBMinusA()
 {
   Set<Integer> difB = new TreeSet<Integer>();
   difB.addAll(two);
   difB.removeAll(intersection());
  return difB;
 }
 
 public Set<Integer> symmetricDifference()
 {  
   Set<Integer> either = new TreeSet<Integer>();
   either = union();
   either.removeAll(intersection());
  return either;
 } 
 
 public String toString()
 {
  return "Set one " + one + "\n" 
    + "Set two " + two +  "\n" + "\n"
    + "union - " + union() + "\n"
    + "intersection - " + intersection() + "\n"
    + "difference A-B - " + differenceAMinusB() + "\n"
    + "difference B-A - " + differenceBMinusA() + "\n"
    + "symmetric difference - " + symmetricDifference() + "\n";
 }
}