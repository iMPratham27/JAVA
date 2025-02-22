
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,3,5,7,9};

		int psArr[] = new int[arr.length];

		psArr[0] = arr[0];

		for(int i=1; i<psArr.length; i++){
		
			psArr[i] = psArr[i-1] + arr[i];
		}

		System.out.println("Array: ");
		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Prefix sum: ");
		for(int i=0; i<psArr.length; i++){
		
			System.out.print(psArr[i] + " ");
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter queries: ");
		int q = sc.nextInt();

		int sum = 0;
		for(int i=0; i<q; i++){
		
			System.out.print("Enter 1st index: ");
			int startIdx = sc.nextInt();
			
			System.out.print("Enter last index: ");
			int endIdx = sc.nextInt();
			
			if(startIdx == 0)
				sum = psArr[endIdx];
			else
				sum = psArr[endIdx] - psArr[startIdx-1];

			
			System.out.println("sum: " + sum);
		}

	}
}
