
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
		
		System.out.print("Actual array: ");
		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i]+"\t");
		}

		for(int i=0; i<arr.length/2; i++){
		
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}

		System.out.print("Reversed array: ");
		for(int i=0 ;i<arr.length; i++){
		
			System.out.print(arr[i]+"\t");
		}
	}
}
