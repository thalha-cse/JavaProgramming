//Program to check the given string is numberic or not
//Numeric means converting string to double, int, float
import java.util.Scanner;

public class String_Numeric {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer converted to numeric : ");
        String str = sc.nextLine();
        boolean numberic = true;

        try{
            double num = Double.parseDouble(str);
        }
        catch (NumberFormatException e){
            numberic = false;
        }
        if(numberic){
            System.out.println(str+" is a numeric");
        }
        else
            System.out.println(str+" is not a numeric");
    }
}
