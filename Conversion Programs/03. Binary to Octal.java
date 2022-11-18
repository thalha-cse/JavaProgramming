import java.util.Scanner;
class BinaryOctal{
    Scanner scan;
    int num;
    void getVal(){
        System.out.println("Binary to Octal");
        scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = Integer.parseInt(scan.nextLine(), 2);
    }
    void convert(){
        String octal = Integer.toOctalString(num);
        System.out.println("Octal Value is : "+octal);
    }
}
class Binary_Octal{ //Main Class
    public static void main(String[] args){
        BinaryOctal obj = new BinaryOctal();
        obj.getVal();
        obj.convert();
    }
}
