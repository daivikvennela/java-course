import java.util.Scanner;

public class stringDupe {

    public static void main (String[] args){
    String testStr = "tes";

        boolean isdup   =  checkForDupes(testStr);
        if(isdup) {
            System.out.println("has dupilcates");
        }else {
            System.out.println("no dupilcates");
        }
        

    }

    private static boolean checkForDupes(String testStr) {
        for(int i = 0; i < testStr.length(); i++){
            System.out.println("first for loop "+testStr.charAt(i));
            for(int j= i+1; j < testStr.length(); j++){
                System.out.println("second for loop "+testStr.charAt(j));
                if (testStr.charAt(i) == testStr.charAt(j)) {
                    return true;
    
                }
            }//end of second for loop
        

        }// end of first for loop
            return false;
    }


    // 




}