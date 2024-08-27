
class RecInsertionSort{

	void insertionSort(int arr[], int start){

		if(start == arr.length)
			return;
	
		int j = start-1;
		int element = arr[start];
		while(j>=0 && arr[j] > element){
		
			arr[j+1] = arr[j];
			j--;
		}

		arr[j+1] = element;

		insertionSort(arr, start+1);
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{8, 3, 1, 7, 5, 4, 2};

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		RecInsertionSort obj = new RecInsertionSort();

		obj.insertionSort(arr,1);

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
