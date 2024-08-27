
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[]{2,5,2,7,8,9,2};

		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int count = 0;
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
		
			if(num==arr[i]){
			
				count++;
				flag = true;
			}
		}

		System.out.println("Number "+num+" occured "+count+" times.");

		if(!flag){
		
			System.out.println("Number not found!");
		}
	}
}
