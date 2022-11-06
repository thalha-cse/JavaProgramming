import java.util.Scanner;
public class ATM_Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 100000, deposit, withdraw;
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter money to be withdraw : ");
                    withdraw = sc.nextInt();
                    if(balance>=withdraw){
                        balance = balance-withdraw;
                        System.out.println("Please collect your money");
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited : ");
                    deposit = sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Voice Money has been successfully");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
