//Occurrence of element in given array
import java.util.Scanner;
public class OccurrenceCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter no. of elements do you want in array : ");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Enter "+num+" Elements : ");
        for(int i=0;i<num;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element of which you want to count number of occurrences : ");
        int x = sc.nextInt();
        for(int i=0;i<num;i++){
            if(array[i]==x){
                count++;
            }
        }
        System.out.println("Number of occurrences of element "+x+" is : "+count);
    }
}
