//Program to check the frequency of char in a given string
import java.util.Scanner;
public class Frequency_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int frequency =0;
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter the character to find the frequency : ");
        char ch = sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency : "+frequency);
    }
}
