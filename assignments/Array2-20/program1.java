
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
		
		int count = 0;
		System.out.print("Even elements are: ");
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]%2==0){
			
				count++;
				System.out.print(arr[i]+"\t");
			}
		}

		System.out.println("Count of even elements are: "+count);
	}
}
