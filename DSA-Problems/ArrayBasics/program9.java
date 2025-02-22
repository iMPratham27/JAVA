
// Remove an elements at specific index from an array

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4,5};
		int idx = 2;


		List<Integer> list = new ArrayList<>();

		for(int i=0; i<arr.length; i++){
		
			list.add(arr[i]);
		}

		list.remove(idx);

		System.out.println(list);
	}
}
