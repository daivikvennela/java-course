
import java.util.*;



public class StringLength {
    
    public static void main (String[] args){

    
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter your name: ");  
        String name = sc.nextLine();              //reads string  
        System.out.println("Your name is : "+ name); 
    int length = calculateStringLength(name);
    System.out.println("Your name is " + length + " long.");

    }
    public static int calculateStringLength (String name) {
    int stringLength = 0;
    for ( int i=0; i < name.length(); i++) {
    stringLength ++; 
    }
    return stringLength;
    
    
    
    }
  
    



}
    
    
   
      


