
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-7,1,-5,2,-4,3,0};
		int N = arr.length;
		int leftSum[] = new int[N];
		leftSum[0] = arr[0];

		for(int i=1; i <N; i++){
		
			leftSum[i] = leftSum[i-1] + arr[i];
		}

		int rightSum[] = new int[N];
		rightSum[N-1] = arr[N-1];

		for(int i=N-2; i>=0; i--){
		
			rightSum[i] = rightSum[i+1] + arr[i]; 
		}



		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		for(int i=0; i<arr.length; i++){
		
			System.out.print(leftSum[i] + " ");
		}

		System.out.println();
		
		for(int i=0; i<arr.length; i++){
		
			System.out.print(rightSum[i] + " ");
		}
	}
}
