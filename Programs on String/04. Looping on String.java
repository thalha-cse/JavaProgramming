import java.util.Scanner;
public class Looping_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            System.out.println(a);
        }
    }
}
