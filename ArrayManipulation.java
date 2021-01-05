

    import java.util.*;

    public class ArrayManipulation {
    public static void main (String[] args){
    int[] birthday = {1,2,0,8,2,0,0,5};
    //reverseIntArray(birthday);
    int[] dhatbirthday = {0,3,0,2,2,0,0,8};
    //System.out.println("----Print(RegularIntArray)-------");
    //printIntArray(dhatbirthday);
    String[] myName = {"D","A","I","V","I","K" };
    reverseNameArray(myName);
    
    }
    public static void reverseIntArray (int[] numbers) {
    
    for (int i = numbers.length - 1; i >= 0 ; i-- ) {
    System.out.println(numbers[i]);
    System.out.println("index- " + i );
    
    }
    
    
    }
    public static void printIntArray (int[] numbers) {
    for (int i = 0; i <  numbers.length ; i++ ) {
    System.out.println(numbers[i]);
    System.out.println("index" + i );
    
    }
    
    
    }
    
    public static void reverseNameArray (String[] name ) {
    for (int i = name.length - 1; i >= 0 ; i-- ) {
    System.out.println(name[i]);
    System.out.println("index" + i );
    
    }
    }
    
    
    } // main array
    
      
