import java.util.Scanner;
public class Value_In_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {10, 90, 87, 76, 56, 98};
        System.out.println("Enter the Value : ");
        int value = sc.nextInt();
        boolean found = false;
        for(int n:num){
            if(n==value){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(value+" is found");
        }
        else {
            System.out.println(value+" is not found");
        }
    }
}
