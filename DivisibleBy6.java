public class DivisibleBy6{
	public static void main(String args[]){
		int x=90;
		if(x%2==0){
			if(x%3==0){
				System.out.println("the given number is divisible by 6");
			}else{
				System.out.println("not divisible");
			}
		}
		else{
			System.out.println("the given number is not divisible by 6");

		}
	}
}
