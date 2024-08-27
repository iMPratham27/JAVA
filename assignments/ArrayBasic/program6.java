
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		
		System.out.println("Enter characters: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.next().charAt(0);
		}

		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}
	}
}
