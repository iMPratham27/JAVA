
// count occurences of anagrams (for => fro, orf, rfo)

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		String text = "forxxorfxdofr";
		String pattern = "for";

		int k = pattern.length();
		int n = text.length();

		Map<Character,Integer> patternMap = new HashMap<>();
		for(char ch : pattern.toCharArray()){
		
			if(patternMap.containsKey(ch)){
			
				patternMap.put(ch,patternMap.get(ch)+1);
			}else{
			
				patternMap.put(ch,1);
			}
		}

		Map<Character,Integer> windowMap = new HashMap<>();

		int start = 0;
		int count = 0;

		for(int end=0; end<n; end++){
		
			char endChar = text.charAt(end);
			if(windowMap.containsKey(endChar)){
			
				windowMap.put(endChar, windowMap.get(endChar)+1);
			}else{
			
				windowMap.put(endChar,1);
			}


			if(end-start+1 == k){
			
				if(windowMap.equals(patternMap)){
				
					count++;
				}

				char startChar = text.charAt(start);
				if(windowMap.get(startChar) == 1){
				
					windowMap.remove(startChar);
				}else{
				
					windowMap.put(startChar, windowMap.get(startChar)-1);
				}

				start++;
			}
		}

		System.out.println(count);
	}
}
