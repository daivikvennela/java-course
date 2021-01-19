import java.util.Scanner;
import java.util.*;
public class swapVar {
    public static void main(String[] args){
        // System.out.println("Enter your first variable: ");
        // Scanner var1sc= new Scanner(System.in);
        // int var1 = Integer.parseInt(var1sc.nextLine());
        // System.out.println("Enter your second variable: ");
        // Scanner var2sc= new Scanner(System.in);
        // int var2 = Integer.parseInt(var2sc.nextLine());

        int var1 =2;
        int var2=4;
    System.out.println("variable 1(before swap)= "+var1);
    System.out.println(var2+"variable 2(before swap)= "+var2);
    System.out.println("---------------------------------Creating new variables and swaping---------------------------------");
    int tempVar1 = var1;
    var1 = var2;
    var2=tempVar1;
    System.out.println("variable 1(after swap)= "+var1);
    System.out.println("variable 2(after swap)= "+var2);























    }
}