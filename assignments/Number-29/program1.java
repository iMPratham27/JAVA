// perfect number => if num=6 then divisor=>1,2,3(excluding 6) =>(1+2+3=6) => if(num==sum) then it is a perfect number

import java.util.*;

class PerfectNum{
	
	static void perfectNum(int num){
	
		int sum = 0;

		for(int i=1; i<num; i++){
			
			if(num%i==0){
			
				sum = sum + i;
			}

		}

		if(sum==num){
		
			System.out.println(num+" is a perfect number");
		}else{
		
			System.out.println(num+" is not a perfect number");
		}
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num:");
		int num = sc.nextInt();

		perfectNum(num);
	}
}
