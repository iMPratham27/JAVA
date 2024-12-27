
import java.util.*;

class ProgramDemo{

	static int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};

	public static void main(String[] args){
	
		ArrayList<Integer> evenArrayList = new ArrayList<>();
		ArrayList<Integer> oddArrayList = new ArrayList<>();

		for(int i=0; i<arr.length; i++){
		
			if(arr[i]%2==0){
			
				evenArrayList.add(arr[i]);
			}else{
				oddArrayList.add(arr[i]);
			}
		}

		System.out.println("Even elements: " + evenArrayList);
		System.out.println("Odd  elements: " + oddArrayList);
	}
}
