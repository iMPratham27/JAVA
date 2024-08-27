
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}

		System.out.print("Elements divisible by 3: ");
		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]%3==0){
			
				System.out.print(arr[i]+"\t");
				sum = sum + arr[i];
			}
		}

		System.out.println("Sum of elements divisible by 3: "+sum);
	}
}
