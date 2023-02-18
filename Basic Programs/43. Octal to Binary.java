import java.util.Scanner;
public class Octal_Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Octal to Binary");
        System.out.println("Enter the number : ");
        num = Integer.parseInt(sc.nextLine());

        String Binary = Integer.toBinaryString(num);
        System.out.println("Binary value is : "+Binary);

    }
}
