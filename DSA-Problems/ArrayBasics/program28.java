

// remove duplicates from unsorted array

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,1,4,2};

		Set<Integer> set = new HashSet<>();

		for(int i=0; i<arr.length; i++){
		
			set.add(arr[i]);
		}

		System.out.println(set);
	}
}
