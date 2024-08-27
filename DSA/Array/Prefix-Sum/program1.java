
import java.util.*;

class ArrayDemo{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start index: ");
		int startIdx = sc.nextInt();
		
		System.out.print("Enter end index: ");
		int endIdx = sc.nextInt();

		int arr[] = new int[]{2,5,3,11,7,9,4};

		int N = 7;

		int sum = 0;

		for(int i=startIdx; i<=endIdx; i++){
		
			sum = sum + arr[i];
		}

		System.out.println("Sum: "+sum);
	}
}
