import java.util.Scanner;
class Binary_Hexadecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Binary to Hexadecimal");
        System.out.println("Enter the number : ");
        num = Integer.parseInt(sc.nextLine());

        String hexa = Integer.toHexString(num);
        System.out.println("Hexadecimal Value is : "+hexa);
    }
}
