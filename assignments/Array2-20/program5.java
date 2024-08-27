
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.nextInt();
		}

		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			if(i%2==1){
			
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of odd indexed elements: "+sum);
	}
}
