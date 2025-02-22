
// Elements in the range

/*
class ArrayDemo{

	public static void main(String[] args){
	
		int A = 2;
		int B = 5;
		boolean present = false;

		int arr[] = new int[]{1,4,5,2,7,8,3};

		for(int i=0; i<arr.length; i++){
		
			for(int j=A; j<=B; j++){
			
				if(j == arr[i])
					present = true;
			}
		}

		if(present)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

*/

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int A = 2, B = 5;
		
		int arr[] = new int[]{1,4,5,2,7,8,3};

		boolean present = false;

		Set<Integer> st = new HashSet<Integer>();

		for(int i=0; i<arr.length; i++){
		
			st.add(arr[i]);
		}

		for(int i=A; i<=B; i++){
		
			if(st.contains(i))
				present = true;
		}

		if(present)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

