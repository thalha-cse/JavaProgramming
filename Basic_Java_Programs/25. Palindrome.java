import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int num, reversedNum = 0, rem;
num = sc.nextInt();
int OriginalNum = num;
while(num!=0){
rem = num%10;
reversedNum = reversedNum * 10 + rem;
num = num/10;
}
if(OriginalNum==reversedNum){System.out.println(OriginalNum+" is Palindrome");
}
else{System.out.println(OriginalNum+" is not a palindrome");}
}
}
