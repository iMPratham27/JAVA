

// Smallest and second smallest element in the array

/*
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = {2,4,3,5,6};

		Set<Integer> set = new HashSet<>();

		for(int i=0; i<arr.length; i++){
		
			set.add(arr[i]);
		}

		List<Integer> list = new ArrayList<>(set);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
	} 
}
*/


class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = {2,4,3,5,6};

		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] < min){
			
				min = arr[i];
			}

			if(arr[i] < secMin && arr[i] != min){
			
				secMin = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(secMin);
	}
}






