import java.util.Scanner;
public class String_N_Equal_Parts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter the how many parts do you want : ");
        int num = sc.nextInt();
        if(str.length()%num!=0){
            System.out.println("Invalid Input");
            System.out.println("Try Again!");
        }
        int sub_size = str.length()/num;
        System.out.println("Sub size is : "+sub_size);
        for(int i=0;i<str.length();i++){
            if(i%sub_size==0) {
                System.out.println();
            }
            System.out.print("[" + str.charAt(i) + "]");
        }
    }
}

/* Output 01:
Enter the String : MoneyHeist
Enter the how many parts do you want : 2
Sub size is : 5
[M][o][n][e][y]
[H][e][i][s][t]

Output 02:
Enter the String : MoneyHeist
Enter the how many parts do you want : 5
Sub size is : 2
[M][o]
[n][e]
[y][H]
[e][i]
[s][t]
*/
