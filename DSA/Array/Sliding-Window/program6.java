
// longest substring with k unique characters

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		String str = "aabacbebebe";
		int k = 3; // we need longest substring with 3 unique characters


		int start = 0;
		int maxLen = 0;

		Map<Character,Integer> windowMap = new HashMap<>();

		for(int end=0; end<str.length(); end++){
		
			// add current character to the window
			char endChar = str.charAt(end);
			if(windowMap.containsKey(endChar)){
			
				windowMap.put(endChar, windowMap.get(endChar)+1);
			}else{
			
				windowMap.put(endChar,1);
			}
			
			// check if unique character exeeds k
			while(windowMap.size() > k){
			
				char startChar = str.charAt(start);
				if(windowMap.containsKey(startChar)){
				
					if(windowMap.get(startChar) > 1){
					
						windowMap.put(startChar,windowMap.get(startChar)-1);
					}else{
					
						windowMap.remove(startChar); // if freq of startChar is 0 then we remove it
					}
				}

				// slide the window
				start++;
			}

			// check if window matches k unique character and update the maxLen
			if(windowMap.size() == k){
			
				int len = end-start+1;
				if(len > maxLen){
				
					maxLen = len;
				}
			}
		}

		System.out.println(maxLen);
	}
}
