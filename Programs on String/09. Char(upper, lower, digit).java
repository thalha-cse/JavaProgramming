//This program return the case of entered character upper or lower or digit
import java.util.Scanner;
public class Alpha_Upper_Lower_Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String or digit : ");
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=96){
            System.out.println("Uppercase...");
        }
        else if(ch>=97 && ch<=123){
            System.out.println("Lowercase...");
        }
        else
            System.out.println("Digit");
    }
}
