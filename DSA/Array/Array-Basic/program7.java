
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{9,0,1,3,0};
		int N = 5;


		for(int i=0; i<N-1; i++){
			
			int j = i+1;
			if(arr[j] > arr[i]){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			j++;
	
					
		}

		for(int i=0; i<N; i++){
		
			System.out.print(arr[i]);
		}

	}
}
