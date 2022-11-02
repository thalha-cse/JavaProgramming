import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int result=0, temp;
        temp=num;
        while(num!=0){
            int rem=num%10;
            result=result+rem*rem*rem;
            num=num/10;
        }
        if(result==temp){
            System.out.println(temp+" is Armstrong number");
        }
        else{
            System.out.println(temp+" is not a Armstrong number");
        }
    }
}
