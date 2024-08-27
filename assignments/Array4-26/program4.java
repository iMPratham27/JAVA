
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

		System.out.print("Enter a num: ");
		int num = sc.nextInt();

		int count = 0;
		for(int i=0; i<arr.length; i++){
		
			if(arr[i] == num){
			
				count++;
			}
		}

		if(count==2 || count>2){
		
			System.out.println(num+" occured twice or more than two times");
		}else if(count==1){
		
			System.out.println(num+" occured only once");
		}else{
		
			System.out.println("num does not exists");
		}
	}
}
