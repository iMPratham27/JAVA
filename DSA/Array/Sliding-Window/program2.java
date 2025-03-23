// first negative number in every window of size k

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		// brute force
		/*
		int arr[] = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		
		List<Integer> result = new ArrayList<>();

		for(int i=0; i<=arr.length-k; i++){
		
			boolean found = false;
			for(int j=i; j<i+k; j++){
			
				if(arr[j]<0){
				
					result.add(arr[j]);
					found = true;
					break;
				}
			}

			if(!found){
			
				result.add(0);
			}
		}

		System.out.println(result);
		*/


		// optimal solution

		int arr[] = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		
		List<Integer> negatives = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		// i => start & j => end	
		
		int i=0;
		for(int j=0; j<arr.length; j++){
		
			if(arr[j]<0){
			
				negatives.add(arr[j]);
			}

			// check if window size equals k
			if(j-i+1 == k){ 
			
				// add first negative to result or 0 if not present
				if(!negatives.isEmpty()){
				
					result.add(negatives.get(0));
				}else{
				
					result.add(0);
				}

				// When an element leaves the window, check if it’s the first negative stored.If it is, remove it from the list to keep only the relevant negatives.
				if(!negatives.isEmpty() && arr[i] == negatives.get(0)){
				
					negatives.remove(0);
				}
				i++;
			}
		}

		System.out.println(result);
	}
}
