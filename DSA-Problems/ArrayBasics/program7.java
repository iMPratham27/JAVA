

// Form largest number from digits

import java.util.*;

class ArrayDemo{

	static String largestNumber(int arr[]){
	
		String sa[] = new String[arr.length];

		// convert integer to string
		for(int i=0; i<arr.length; i++){
		
			sa[i] = Integer.toString(arr[i]);
		}

		// sort the string using custom comparator
		Arrays.sort(sa,new Comparator<String>(){
		
			public int compare(String a, String b){
			
				String o1 = a+b;
				String o2 = b+a;

				return o2.compareTo(o1); // descending order
			}
		});

		// if the largest number is zero then return zero
		if(sa[0].equals("0"))
			return "0";

		StringBuilder sb = new StringBuilder();

		// combine all sorted strings to result
		for(String s: sa){
		
			sb.append(s);
		}

		return sb.toString();
	}

	public static void main(String[] args){

		int arr[] = new int[]{1,2,3};
	
		String largest_num = largestNumber(arr);

		System.out.println(largest_num);
	}
}
