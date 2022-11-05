//This program removes the whitespaces from the given string
import java.util.Scanner;
public class Remove_Whitespaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Original String : "+str);
        System.out.println("Original String Length : "+str.length());
        str = str.replace(" ", "");
        System.out.println("Updated String : "+str);
        System.out.println("Updated String Length : "+str.length());
    }
}
