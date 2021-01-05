import java.util.*;
public class BigO {
public static void main (String[] args){
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Daivik");
    System.out.println("-------------");
    //  boolean contains = hasValue(alist, "Daivik");
      //System.out.println(contains);
      boolean hasDupes = hasDuplicate(alist);
      System.out.println(hasDupes);
}

static boolean hasValue(ArrayList<String> str, String value)
{
 for (int i=0; i < str.size() ; i++ )
 {
     System.out.println(str.get(i));
  if (str.get(i) == value) return true;
 }
 return false;
}

static boolean hasDuplicate(ArrayList<String> str)
{
 for (int out = 0; out < str.size(); out++)
 {
     System.out.println("outerLoop value= " + out);
     
     System.out.println("outerLoop value= " + str.get(out));

     System.out.println("------------------------ ");
  for (int in = 0; in < str.size(); in++)
  {
    System.out.println("innerLoop value= " + in);
    System.out.println("innerLoop value= " + str.get(in));
   if (out == in) continue;
   if (str.get(out) == str.get(in)) return true;
  }

  System.out.println("------------------------ ");

  
 }
 return false;
}
 }
