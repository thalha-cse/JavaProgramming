import java.util.Scanner;
public class UserAuthentication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username : ");
        String username = sc.nextLine(); //username:user
        System.out.println("Enter the Password : ");
        String password = sc.nextLine(); //username:user
        if(username.equals("user") && password.equals("user")){
            System.out.println("Authentication successful");
        }
        else
            System.out.println("Authentication Failed");
    }
}
