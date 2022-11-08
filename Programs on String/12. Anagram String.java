//Program to check whether two string are equal or not using Array
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean flag = false;
            for(int i=0;i<charArray1.length;i++){
                if(charArray1[i] == charArray2[i]) {
                    flag = true;
                    continue;
                }
                else
                    break;
            }
            if(flag) {
                System.out.println("Two Strings are anagram");
            }
        }
        else
            System.out.println("Two Strings are not anagram");
    }
}
