
import java.util.*;
class ArrayDemo{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{1,5,9,8,7,6};

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Output: ");
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]==num){
			
				System.out.println("num "+num+" is found at index "+i);
				flag = true;
				break;
			}
		}

		if(!flag){
		
			System.out.println("number not found!");
		}
	}     

}
