import java.util.Scanner;
public class IfElse1{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number");
int x = in.nextInt();
if(x>0){
System.out.println(x+"is positive");
}
else{
System.out.println(x+"is negative");
}
}
}
