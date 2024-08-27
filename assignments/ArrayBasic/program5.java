
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){
		
			if(arr[i]<10){
			
				System.out.println(arr[i] + " is less than 10");
			}
		}
	}
}
