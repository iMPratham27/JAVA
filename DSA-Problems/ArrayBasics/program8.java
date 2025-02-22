
// Even occuring elements

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{9,12,23,10,12,12,15,23,14,12,15};

		Map<Integer,Integer> map = new HashMap<>();

		// store array elements in map according to their occurences
		for(int num : arr){
		
			if(map.containsKey(num)){
			
				map.put(num , map.get(num)+1);  // get() method return value of that num
			}else{
			
				map.put(num , 1);
			}
		}

		boolean found = false;
		
		// we iterate over the map and check even occurences 
		// entrySet() => iterates over both keys and values. provides set view of key-value pair stored in map
		
		// var => Map.Entry<Integer, Integer>  =>  Map.Entry represents single key-value pair in the map
		for(var entry : map.entrySet()){
		
			if(entry.getValue()%2 == 0){
			
				System.out.print(entry.getKey() + " ");
				found = true;
			}
		}

		if(!found){
		
			System.out.println("-1");
		}else{
		
			System.out.println();
		}
	}

}
