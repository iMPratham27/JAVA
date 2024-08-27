
import java.util.*;

class LinearSearch{

	int searchArr(int arr[], int search){
	
		for(int i=0; i<arr.length; i++){
		
			if(search == arr[i])
				return i;
		}

		return -1;
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{7, 3, 2, 11, 5};

		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		LinearSearch obj = new LinearSearch();
		int index = obj.searchArr(arr,search);

		if(index == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index: "+ index);
	}
}
