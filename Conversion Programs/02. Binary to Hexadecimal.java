import java.util.Scanner;
public class Binary_Hexadecimal {
    Scanner scan;
    int num;
    void get(){
        System.out.println("Binary to Hexadecimal");
        scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = Integer.parseInt(scan.nextLine());
    }
    void convert(){
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : "+hexa);
    }
}
class MainClass{
    public static void main(String[] args){
        Binary_Hexadecimal obj = new Binary_Hexadecimal();
        obj.get();
        obj.convert();
    }
}
