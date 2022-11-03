import java.util.Scanner;
public class Char_Int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char a = sc.next().charAt(0);
        int num = a;
        System.out.println("Integer : "+num);
        System.out.println("Character : "+a);
    }
}
