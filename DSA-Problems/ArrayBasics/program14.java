

// Maximum repeating number

import java.util.*;

class ArrayDemo{

	static int maxRepeatingNum(int arr[]){
	
		Map<Integer,Integer> map = new HashMap<>();

		for(int num : arr){
		
			if(map.containsKey(num)){
			
				map.put(num, map.get(num)+1);
			}else{
			
				map.put(num, 1);
			}
		}

		int maxFreq = 0;
		int result = Integer.MAX_VALUE;

		for(var entry : map.entrySet()){
		
			int num = entry.getKey();
			int freq = entry.getValue();

			if(freq > maxFreq || (freq == maxFreq && num < result)){
			
				maxFreq = freq;
				result = num;
			}
		}

		return result;
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{2,2,1,0,0,1};

		int ans = maxRepeatingNum(arr);

		System.out.println(ans);
	}
}
