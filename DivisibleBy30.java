public class DivisibleBy30{
	public static void main(String args[]){
		int num= 786;
		if(num%2==0){
			if(num%3==0){
				if(num%5==0){
					System.out.println("the number is divisible by 30");
				}else{
					System.out.println("the number is not divisible by 30");
				}
			}else{
				System.out.println("the number is not divisible by 30");
			}
		}else{
			System.out.println("the number is not divisible by 30");
		}
	}
}
