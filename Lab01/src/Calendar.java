//6.4
import java.time.Month;
import java.util.Scanner;
public class Calendar {
    String[][] Calendar = {{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"},
                        {"Jan.", "Feb.","Mar.","Apr.","May","June","July","Aug.","Sep.","Oct.","Nov.","Dec."},
                        {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct","Nov","Dec"},
                        {"1", "2", "3", "4", "5", "6", "7", "8", "9","10","11","12"},
                        {"31","28","31","30","31","30","31","31","30","31","30","31"},
                        {"31","29","31","30","31","30","31","31","30","31","30","31"}};
    int Month = 0;
    int year = 0;

    public void setMonth(){
        System.out.print("Enter month: ");
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        int n = 0;
        for (int i = 0; i <= 3; i++) {
           for (int j = 0; j <= 11 ; j++) {
               if(Calendar[i][j].equals(month)){
                   Month = j;
                   break;
               }
               n++;
           }
        }
        if (n == 48) {
            System.out.println("Invalid input");
            setMonth();
        }
    }

    public void setYear(){
        System.out.print("Enter year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if(year < 0 || year > 9999){
            System.out.println("Invalid input");
            setYear();
        }
    }

    public void displayNumberOfDayOfMonth(){
        System.out.print("The number of days in the month: ");
        if(year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)){
            System.out.println(Calendar[5][Month]);
        }else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            System.out.println(Calendar[4][Month]);
        }else if(year % 4 != 0){
            System.out.println(Calendar[4][Month]);
        }
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();
        cal.setMonth();
        cal.setYear();
        cal.displayNumberOfDayOfMonth();
        System.exit(0);
    }
}
