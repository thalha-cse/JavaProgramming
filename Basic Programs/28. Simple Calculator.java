import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double num1 = sc.nextInt();
        double num2 =sc.nextInt();
        System.out.println("Enter an operator : ");
        char ch = sc.next().charAt(0);
        double result;
        switch(ch){
            case '+':
                result=num1+num2;
                System.out.println("Result : "+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("Reuslt : "+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("Result : "+result);
                break;
            case '/':
                result=num1/num2;
                System.out.println("Reuslt : "+result);
                break;
            default:
                System.out.println("Invalid Input...");
        }
        sc.close();
    }
}
