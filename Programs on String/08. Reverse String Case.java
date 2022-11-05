import java.util.Scanner;
public class Reverse_Case_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        boolean isLower;
        char[] strArray = str.toCharArray();
        for(int i=0;i<strArray.length;i++){
            char ch = strArray[i];
            isLower = ch>='a' && ch<='z';
            String value = String.valueOf(ch);
            if(isLower){
                strArray[i] = value.toUpperCase().charAt(0);
            }
            else {
                strArray[i] =  value.toLowerCase().charAt(0);
            }
        }
        System.out.println(String.valueOf(strArray));
    }
}
