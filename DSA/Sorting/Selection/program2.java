
class RecSelectionSort{

	void selectionSort(int arr[], int start){
	
		if(start == arr.length-1)
			return;

		int minIdx = start;

		for(int j=start+1; j<arr.length; j++){
		
			if(arr[j] < arr[minIdx])
				minIdx = j;
		}

		int temp = arr[start];
		arr[start] = arr[minIdx];
		arr[minIdx] = temp;

		selectionSort(arr, start+1);
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{9, 2, 7, 3, 1, 8, 4, 6};

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		RecSelectionSort obj = new RecSelectionSort();
		
		obj.selectionSort(arr,0);

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
