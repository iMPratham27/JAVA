
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee count: ");
		int count = sc.nextInt();

		int arr[] = new int[count];

		for(int i=0; i<arr.length; i++){
		
			System.out.print("Enter employee age: ");
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){
		
			System.out.println("Employee age: " + arr[i]);
		}
	}
}
