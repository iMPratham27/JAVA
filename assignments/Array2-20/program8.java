
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
		
		System.out.println("Output: ");
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]>5 && arr[i]<9){
			
				System.out.println(arr[i]+" is greater than 5 but less than 9");
			}
		}
	}
}
