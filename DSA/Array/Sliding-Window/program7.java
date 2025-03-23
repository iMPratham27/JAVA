
// Longest Substring With Without Repeating Characters

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		String str = "pwwkew";

		int start = 0;
		int maxLen = 0;

		Map<Character,Integer> windowMap = new HashMap<>();

		for(int end=0; end<str.length(); end++){
		
			char endChar = str.charAt(end);
			if(windowMap.containsKey(endChar)){
			
				windowMap.put(endChar, windowMap.get(endChar)+1);
			}else{
			
				windowMap.put(endChar,1);
			}


			while(windowMap.size() < end-start+1){
				
				char startChar = str.charAt(start);			

				if(windowMap.containsKey(startChar)){
			
					if(windowMap.get(startChar) > 1){
				
						windowMap.put(startChar, windowMap.get(startChar)-1);
					}else{
				
						windowMap.remove(startChar);
					}
				}

				start++;
			}


			if(windowMap.size() == end-start+1){
			
				int len = end-start+1;
				if(len > maxLen){
				
					maxLen = len;
				}
			}
		}

		System.out.println(maxLen);
	}
}
