import java.util.Scanner;
public class Capitalize_First_Letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        for(int i=0;i<strArray.length;i++){
            String newString = strArray[i];
            String firstletter = newString.substring(0, 1);
            String remainingletter = newString.substring(1, newString.length());
            firstletter = firstletter.toUpperCase();
            newString = firstletter+remainingletter;
            strArray[i] = newString;
        }
        String newMessage = " ";
        for(String element:strArray){
            newMessage = newMessage+element+" ";
        }
        System.out.println(newMessage);
    }
}
