import java.util.Scanner;
public class Convert_Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int days = sc.nextInt();
        int year = days/356;
        days = days%365;
        System.out.println("No. of year : "+year);
        int week = days/7;
        days = days%7;
        System.out.println("No. of Week : "+week);
        int day = days;
        System.out.println("No. of days : "+day);
    }
}
