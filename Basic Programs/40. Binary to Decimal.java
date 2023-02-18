import java.util.Scanner;
public class Binary_Decimal {
    Scanner scan;
    int num;
    void getVal(){
        System.out.println("Binary to Decimal");
        scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = Integer.parseInt(scan.nextLine(),2);
    }
    void convert(){
        String decimal = Integer.toString(num);
        System.out.println("Decimal value is : "+decimal);
    }
}
class binarydecimal{
    public static void main(String[] args){
        Binary_Decimal obj = new Binary_Decimal();
        obj.getVal();
        obj.convert();
    }
}
