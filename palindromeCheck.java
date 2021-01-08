import java.util.Scanner;

public class palindromeCheck {






public static void main (String[] args){
System.out.println("Start");
 System.out.println("Enter your a word, (all lowercase): ");
Scanner userWordSc= new Scanner(System.in);
String userWordStr = userWordSc.nextLine();
boolean palinCheck = isPailindrome(userWordStr);
System.out.println(palinCheck);

}









public static boolean isPailindrome (String str) {
    String revStr = "";
    for(int i = str.length() - 1; i >= 0; i--){
   
    revStr = revStr + str.charAt(i);
  


    }
    if (revStr.compareTo(str)==0){
       return true;

    } 
 return false;

}




}