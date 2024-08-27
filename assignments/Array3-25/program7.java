
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.nextInt();
		}

		System.out.println("Output: ");
		for(int i=0; i<arr.length; i++){

			if(size%2==0){
			
				if(arr[i]%2==0){
				
					System.out.println(arr[i]);
				}
			}else if(size%2==1 || size>=5){
			
				if(arr[i]%2==1){
				
					System.out.println(arr[i]);
				}
			}
		}
	}
}
