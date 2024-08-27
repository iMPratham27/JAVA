
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.next().charAt(0);
		}

		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		System.out.println("Output: ");
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]==ch){
			
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
