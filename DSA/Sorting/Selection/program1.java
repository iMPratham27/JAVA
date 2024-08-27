
class SelectionSort{

	public static void main(String[] args){
	
		int arr[] = new int[]{9, 2, 7, 3, 1, 8, 4, 6};

		for(int i=0; i<arr.length-1; i++){
		
			int minIdx = i;

			for(int j=i+1; j<arr.length; j++){
			
				if(arr[j] < arr[minIdx])
					minIdx = j;
			}

			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
