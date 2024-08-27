
// brute-force
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};
		int N = 10;

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int minLength = Integer.MAX_VALUE;
		int len = 0;

		for(int i=0; i<N; i++){
		
			if(arr[i] > max)
				max = arr[i];

			if(arr[i] < min)
				min = arr[i];
		}

		for(int i=0; i<N; i++){
		
			if(arr[i] == min){
			
				for(int j=i+1; j<N; j++){
				
					if(arr[j] == max){
					
						len = j-i+1;
						if(minLength > len)
							minLength = len;
					}
				}
			
			}else if(arr[i] == max){
			
				for(int j=i+1; j<N; j++){
				
					if(arr[j] == min){
					
						len = j-i+1;
						if(minLength > len)
							minLength = len;
					}
				}
			}
		}

		System.out.println("length: "+minLength);
	}
}

// T.C. => O(N^2)
