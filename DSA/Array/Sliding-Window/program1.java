
// maximum subarray sum equals k

class ArrayDemo{

	public static void main(String[] args){
	
		/*
		// brute force
		int arr[] = new int[]{2, 1, 5, 1, 3, 2};
		int k = 3;

		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<=arr.length-k; i++){
		
			int sum = 0;
			for(int j=i; j<i+k; j++){
			
				sum = sum + arr[j];
			}

			if(sum > maxSum){
			
				maxSum = sum;
			}
		}

		System.out.println(maxSum);
		*/


		
		// optimal
		/*
		int arr[] = new int[]{2, 1, 5, 1, 3, 2};
		int k = 3;

		int maxSum = 0;
		int windowSum = 0;

		for(int i=0; i<k; i++){
			
			windowSum = windowSum + arr[i];
		}

		maxSum = windowSum;
		
		for(int i=k; i<arr.length; i++){
		
			windowSum = windowSum + arr[i] - arr[i-k];

			if(windowSum > maxSum){
			
				maxSum = windowSum;
			}
		}

		System.out.println(maxSum);
		*/



		//another optimal approach(generic approach)
		
		int arr[] = new int[]{2, 1, 5, 1, 3, 2};
		int k = 3;

		int i = 0; // start
		int maxSum = Integer.MIN_VALUE;
		int windowSum = 0;

		for(int j=0; j<arr.length; j++){
		
			windowSum = windowSum + arr[j]; // add elements to the window

			if(j-i+1 == k){ // check if window size equals k
				
				if(windowSum > maxSum){
				
					maxSum = windowSum;
				}
				windowSum = windowSum - arr[i]; // remove previous element
				i++; // slide the widow forward
			}
		}
		System.out.println(maxSum);
	}
}
