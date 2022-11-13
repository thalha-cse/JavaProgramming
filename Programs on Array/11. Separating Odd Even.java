//In this program Odd and even will be separated from the given set of array
import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j=0, k=0;
        System.out.println("Enter no. of elements you want in an array : ");
        int num = sc.nextInt();
        int a[] = new int[num];
        int odd[] = new int[num];
        int even[] = new int[num];
        System.out.println("Enter the all the elements : ");
        for(int i=0;i<num;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if(a[i]%2!=0){
                odd[j] = a[i];
                j++;
            }
            else{
                even[k] = a[i];
                k++;
            }
        }
        System.out.print("Odd : ");
        if(j>1){
            for(int i=0;i<(j-1);i++){
                System.out.print(odd[i]+", ");
            }
            System.out.println(odd[j-1]);
        }
        else{
            System.out.println("No numbers");
        }
        System.out.println("");
        System.out.print("Even : ");
        if(k>1){
            for(int i=0;i<(k-1);i++){
                System.out.print(even[i]+", ");
            }
            System.out.println(even[k-1]);
        }
        else{
            System.out.println("No numbers");
        }
    }
}
