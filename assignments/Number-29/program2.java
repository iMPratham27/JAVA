
import java.util.*;

class StrongNum{
	
	static void strongNum(int num){
	
		int temp = num;
		int sum = 0;
		while(temp>0){
		
			int digit = temp%10;
			sum = sum + factorial(digit);
			temp = temp/10;
		}

		if(sum == num){
		
			System.out.println(num+" is a strong number");
		}else{
		
			System.out.println(num+" is not a strong number");
		}
	}

	static int factorial(int digit){
		
		int fact = 1;
		for(int i=1; i<=digit; i++){
		
			fact = fact*i;
		}

		return fact;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = sc.nextInt();

		strongNum(num);
	}
}
