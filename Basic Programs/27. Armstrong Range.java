import java.util.Scanner;
public class Armstrong_Range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower and upper range : ");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        for(int number=lower+1;number<upper;number++){
            int digit=0;
            int result=0;
            int OriginalNumber = number;
            while (OriginalNumber!=0){
                OriginalNumber/=10;
                digit++;
            }
            OriginalNumber=number;
            while (OriginalNumber!=0){
                int rem=OriginalNumber%10;
                result=result+rem*rem*rem;
                OriginalNumber/=10;
            }
            if(result==number){
                System.out.println(number+", ");
            }
        }
    }
}
