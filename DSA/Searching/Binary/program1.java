
// for binary search, array elements should be sorted

import java.util.*;

class BinarySearch{

	int binarySearch(int arr[], int search){
	
		int start = 0;
		int end = arr.length-1;

		while(start <= end){
		
			int mid = (start + end)/2;

			if(arr[mid] == search)
				return mid;

			if(arr[mid] > search)
				end = mid - 1;

			if(arr[mid] < search)
				start = mid + 1;
		}

		return -1;
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{4, 7, 11, 24, 35, 57, 75, 87};

		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		BinarySearch obj = new BinarySearch();
		int index = obj.binarySearch(arr,search);

		if(index == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index: "+ index);
	}
}
