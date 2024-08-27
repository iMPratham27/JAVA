
class ArrayDemo{

	static void countArr(){
	
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
		int N = 10;
		int K = 10;

		int count = 0;
		for(int i=0; i<N; i++){
		
			for(int j=0; j<N; j++){
			
				if(arr[i]+arr[j]==K && i!=j)
					count++;
			}
		}

		System.out.println("Count: "+count);
	}

	public static void main(String[] args){
	
		countArr();
	}
}

// T.C. => O(N^2)
