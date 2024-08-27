
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4};
		int N = 4;
		
		int product = 1;
		for(int i=0; i<N; i++){
		
			product = product * arr[i];
		}

		System.out.println(product);
	}
}
