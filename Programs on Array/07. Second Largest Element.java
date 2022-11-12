import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element do you want : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int temp;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is : "+a[n-2]);
        System.out.println("Smallest number is : "+a[0]);
    }
}
