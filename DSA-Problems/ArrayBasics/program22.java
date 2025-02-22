

// Exceptionally odd 

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = {1,2,3,2,3,1,3};

		Map<Integer,Integer> map = new HashMap<>();

		for(int num : arr){
		
			if(map.containsKey(num)){
			
				map.put(num, map.get(num)+1);
			}else{
			
				map.put(num,1);
			}
		}

		for(var entry : map.entrySet()){
		
			int freq = entry.getValue();

			if(freq%2 != 0){
			
				System.out.println(entry.getKey());
			}
		}
		
	}
}
