import java.util.Scanner;
public class String_Comparison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = new String("Java");
        String str2 = new String("Java");
        System.out.println("Assignment operator : "+str1==str2); // == Operator compares the object
        System.out.println("Equals() method : "+str1.equals(str2)); // equals() compares actual values
    }
}
