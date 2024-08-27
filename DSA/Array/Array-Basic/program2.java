
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{3,2,1,56,10000,167};
		int N = 6;

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<N; i++){
		
			if(arr[i] > max)
				max = arr[i];
		}
		
		for(int i=0; i<N; i++){
		
			if(arr[i] < min)
				min = arr[i];
		}

		System.out.println(min + "  " + max);
	}
}
