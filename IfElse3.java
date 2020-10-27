import java.util.Scanner;
public class IfElse3{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("enter the 1st number");
int num1=in.nextInt();
System.out.println("enter the 2nd number");
int num2=in.nextInt();
System.out.println("enter the 3rd number");
int num3=in.nextInt();
if(num1>num2&&num1>num3)
System.out.println(num1+"isthe greatest number");
else if(num2>num3&&num2>num1){
System.out.println(num2+"is the greatest number");
}
else{
System.out.println(num3+"is the greates number");
}
}
}
