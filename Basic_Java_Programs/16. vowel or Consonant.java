import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the character : ");
char a = (char) BF.read();
if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
System.out.println(a+" is vowel character");
}
else{
System.out.println(a+" is consonant character");
}
}
}
