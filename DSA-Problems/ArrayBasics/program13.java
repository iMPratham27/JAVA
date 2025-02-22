

// Find unique element


import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{2,2,2,10,2};
		int k = 4;

		Map<Integer,Integer> map = new HashMap<>();

		for(int num : arr){
		
			if(map.containsKey(num)){
			
				map.put(num, map.get(num)+1);
			}else{
			
				map.put(num, 1);
			}
		}

		for(var entry : map.entrySet()){
		
			if(entry.getValue() != k){
			
				System.out.println(entry.getKey());
			}
		}


	}
}
