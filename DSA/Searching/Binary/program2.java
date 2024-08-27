
// recursion(binary search)

import java.util.*;

class BinarySearchRec{

	int binarySearch(int arr[],int start, int end, int search){

		if(start > end){
		
			return -1;
		}else{
			
			int mid = (start+end)/2; 
		
			if(arr[mid] == search)
				return mid;

			if(arr[mid] < search)
				return binarySearch(arr, mid+1, end, search);
			else
				return binarySearch(arr, start, mid-1, search);
		}
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{4, 7, 11, 24, 35, 57, 75, 87};

		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		int start = 0;
		int end = arr.length-1;

		BinarySearchRec obj = new BinarySearchRec();
		int index = obj.binarySearch(arr, start, end, search);

		if(index == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index: "+ index);
	}
}
