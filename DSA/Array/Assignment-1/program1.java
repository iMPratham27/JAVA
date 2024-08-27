
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,1,-4,5,3};

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] > max)
				max = arr[i];
		}

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] < min)
				min = arr[i];
		}

		System.out.println("Sum: "+ (max + min));
	}
}

//	T.C => O(N)
