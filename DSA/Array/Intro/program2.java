
//brute-force
/*class ArrayDemo{
	
	static void countArr(){
	
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		
		int N = 10;

		int count = 0;
		
		for(int i=0; i<N; i++){
		
			for(int j=0; j<N; j++){
			
				if(arr[j]>arr[i]){
				
					count++;
					break;
				}
			}
		}

		System.out.println("count: "+count);
	}

	public static void main(String[] args){
	
		countArr();
	}
}*/
// T.C. => O(N^2)


// optimized
class ArrayDemo{
	
	static void countArr(){
	
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int N = 10;

		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++){
		
			if(arr[i]>max)
				max = arr[i];
		}

		int count = 0;
		for(int i=0; i<N; i++){
		
			if(arr[i]==max)
				count++;
		}

		System.out.println("Count: "+(N-count));
	}

	public static void main(String[] args){
	
		countArr();
	}
}
// T.C => O(N)
