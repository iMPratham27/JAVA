
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		long num = sc.nextLong();

		long rev = 0L;
		for(long i=num; i>=1; i/=10){
		
			long digit = i%10L;
			rev = rev*10 + digit;
		}
	        
		for(long i=rev; i>=1; i/=10){
		
			long rem = i%10L;
			if(rem%2==1){
			
				System.out.println(rem*rem + " ");
			}
		}
		
	}
}
