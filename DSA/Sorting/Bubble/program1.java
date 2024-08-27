
class BubbleSort{

	public static void main(String[] args){
	
		int arr[] = new int[]{7,3,9,4,2,5,6};
		int count = 0;

		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr.length-i-1; j++){
			
				count++;	

				if(arr[j] > arr[j+1]){
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(count);
	}
}
