import java.util.Scanner;
class Binary_Hexadecimal{
    Scanner scan;
	int num;
	void getVal(){
		System.out.println("Binary to HexaDecimal");
		scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	}
	void convert(){
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
	 }
}
class Main_Class{
    public static void main(String... q){
	Binary_Hexadecimal obj = new Binary_Hexadecimal();
	obj.getVal();
	obj.convert();
}
}
