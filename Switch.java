public class Switch{

    public static void main(String args[]){
	int x=1926;
	if (x%4==0)
	{
           if (x%100==0){
                    if (x%400==0){
                      System.out.println("it is a leap year");                    
                    }else{
                      System.out.println("nots a leap year");
                    }
           }else{
	      System.out.println("it is a leap year");
	   }
	}
	else{
	System.out.println("not a leap year");
	}
     }
}
