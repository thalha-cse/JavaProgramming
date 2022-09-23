import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char a;
System.out.println("Enter the character : ");
a = sc.next().charAt(0);
switch(a){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println(a+" is vowel character");
break;
default:
System.out.println(a+" is consonant character");
}
}
}
