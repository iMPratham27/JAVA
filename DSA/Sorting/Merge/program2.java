

class MergeSort{

	// Merges two sorted subarrays arr[start..mid] and arr[mid+1..end]
	void merge(int arr[], int start, int mid, int end){

		// Lengths of the two subarrays to be merged
		int n1 = mid - start + 1;
		int n2 = end - mid;

		// Temporary arrays to hold the values of the two subarrays
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		// Copying data to arr1[] from arr[start to mid]
		for(int i=0; i<n1; i++){
		
			arr1[i] = arr[start+i];
		}

		// Copying data to arr2[] from arr[mid+1 to end]
		for(int j=0; j<n2; j++){
		
			arr2[j] = arr[mid+1+j];
		}

		int i=0, j=0, k=start;

		// Merging arr1 and arr2 into arr in sorted order
		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i] < arr2[j]){
			
				arr[k] = arr1[i];
				i++;
			}else{
			
				arr[k] = arr2[j];
				j++;
			}
			k++; // move to next position in merged array
		}

		// Copy remaining elements of arr1[], if any
		while(i < arr1.length){
		
			arr[k] = arr1[i];
			i++;
			k++;
		}

		// Copy remaining elements of arr2[], if any
		while(j < arr2.length){
		
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	// Recursively sort first and second halves
	void mergeSort(int arr[], int start, int end){
	
		if(start < end){
		
			int mid = start + (end-start)/2; 

			mergeSort(arr, start, mid); // sort left half

			mergeSort(arr, mid+1, end); // sort right half

			// Merge the sorted halves
			merge(arr, start, mid, end);
		}
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{9, 1, 8, 2, 7, 3, 6, 4};

		int start = 0;
		int end = arr.length-1;

		MergeSort obj = new MergeSort();
		obj.mergeSort(arr, start, end);

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
