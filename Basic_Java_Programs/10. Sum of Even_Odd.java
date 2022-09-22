import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num, sum_even=0, sum_odd=0;
System.out.println("Enter the number : ");
num = sc.nextInt();
int[] a = new int[num];
System.out.println("Enter the "+num+" Elements");
for(int i=0;i<num;i++){
a[i] = sc.nextInt();
}
for(int i=0;i<num;i++){
if(a[i]%2==0){sum_even+=a[i];
}
else{sum_odd+=a[i];}
}
System.out.println("Result : "+sum_even);
System.out.println("Result : "+sum_odd);
}
}
