import java.util.Scanner;
import java.util.*;

public class DaysTillBirthday {
   
     public static void main(String[] args) {
      System.out.println("start of main method");
      daysTillLength();
    }

        public static void daysTillLength () {
            System.out.println("Enter your birth month: ");
                Scanner monthsc= new Scanner(System.in);
                int userMonth = Integer.parseInt(monthsc.nextLine());
            System.out.println("Enter your birth Day: ");
                Scanner daysc= new Scanner(System.in);
                int userDay = Integer.parseInt(daysc.nextLine());
            System.out.println("Enter your current month: ");
                Scanner currentmonthsc= new Scanner(System.in);
                int currentMonth = Integer.parseInt(currentmonthsc.nextLine());
            System.out.println("Enter your current Day: ");
                Scanner currentdaysc= new Scanner(System.in);
                int currentDay = Integer.parseInt(currentdaysc.nextLine());
            
                    System.out.println("Your Birth date is: "+userMonth+"/"+userDay + " The current date is: "+currentMonth+"/"+currentDay);
            int monthDiff = 0;
            int dayDiff = 0;
            if (userMonth > currentMonth){
                monthDiff = userMonth - currentMonth;
                
            }else { 
                 monthDiff = currentMonth - userMonth;
            }

            if (userDay > currentDay){
                dayDiff = userDay - currentDay;
                
            }else { 
                 dayDiff = currentDay - userDay;
            }
        System.out.println("There are: "+ monthDiff + " months and "+ dayDiff + " days unitil your Birthday.");
    }
}