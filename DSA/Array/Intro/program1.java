
class ArrayDemo{
	
	static void printArr(){
	
		int arr[] = new int[]{5,6,2,3,1,9};
		
		int N = 6;

		for(int i=0; i<N; i++){
		
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args){
	
		printArr();
	}
}

// T.C. => O(N)
// S.C. => O(1)
