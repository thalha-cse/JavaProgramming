import java.util.Scanner;
public class RandomString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String random = "";
        System.out.println("Enter the how many size do you want : ");
        int num = sc.nextInt();
        int alphalen = alpha.length();
        for(int i=0;i<num;i++){
            int index = (int)(Math.random()*alphalen-1);
            char random_char = alpha.charAt(index);
            random = random + random_char;
        }
        System.out.println("Random String is : "+random);
    }
}
