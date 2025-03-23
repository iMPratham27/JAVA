
// largest subarray of sum k

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{4,1,1,1,2,3,5};
		int k = 5; // sum

		int start = 0;
		int windowSum = 0;
		int maxLen = 0;

		for(int end=0; end<arr.length; end++){
		
			// add element to the window
			windowSum = windowSum + arr[end];

			// shrink the window if windowSum exeeds k
			if(windowSum > k){
			
				windowSum = windowSum - arr[start];
				start++;
			}

			// check windowSum matches k and update maxLen
			if(windowSum == k){
			
				int len = end-start+1;

				if(len > maxLen){
				
					maxLen = len;
				}
			}
		}

		System.out.println(maxLen);
	}
}
