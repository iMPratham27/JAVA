
// Maximum of all subarrays of size k

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int N = 8;
		int arr[] = new int[]{1,3,-1,-3,5,3,6,7};
		int k = 3;
		
		List<Integer> result = new ArrayList<>();

		int start = 0;
		
		for(int end=0; end<N; end++){
			
			int maxEle = Integer.MIN_VALUE;
	
			if(end-start+1 == k){

				for(int i=start; i<start+k; i++){
				
					if(arr[i] > maxEle){
					
						maxEle = arr[i];
					}
				}
			
				result.add(maxEle);

				start++;
			}
		}

		System.out.println(result);
	}
}
