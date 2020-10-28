public class DivisibleBy10{
	public static void main(String args[]){
		int x=56;
		if(x%2==0){
			if(x%5==0){
				System.out.println("the number is divisible by 10");
			}else{
				System.out.println("the number is not divisible by 10");
			}
		}else{
			System.out.println("the number is not divisible by 10");
		}
	}
}
