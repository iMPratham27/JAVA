
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.nextInt();
		}

		System.out.println("Even elements are: ");
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]%2==0){
			
				System.out.println(arr[i]);
			}
		}
	}
}
