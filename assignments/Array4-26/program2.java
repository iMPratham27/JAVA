
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

		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
		
			if(arr[i]>max){
			
				max = arr[i];
			}

			if(arr[i]<min){
			
				min = arr[i];
			}
		}

		int diff = max - min;

		System.out.println("Difference between minimum and maximum element is: "+diff);
	}
}
