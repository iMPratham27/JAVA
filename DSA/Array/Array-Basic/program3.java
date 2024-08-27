
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,8,7,56,90};
		int N = 5;

		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
		
			if(arr[i] > max)
				max = arr[i];
		}

		System.out.println(max);
	}
}
