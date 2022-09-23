import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
public static void main(String[] args) throws Exception{
InputStreamReader IR = new InputStreamReader(System.in);
BufferedReader BF = new BufferedReader(IR);
int num, flag=0;
System.out.println("Enter the number : ");
num = Integer.parseInt(BF.readLine());
if(num==0||num==1){
System.out.println(num+" is not a prime number");
}
else{
for(int i=2;i<=num/2;i++){
System.out.println(i);
if(num%i==0){
System.out.println(num+" is not a prime number");
flag = 1;
break;
}
}
if(flag==0){
System.out.println(num+" is a Prime number");
}
}
}
}
