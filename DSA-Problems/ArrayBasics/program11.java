

// Product of maximum in first array and minimum in second array

class ArrayDemo{

	public static void main(String[] args){
	
		int arr1[] = new int[]{5,7,9,3,6,2};
		int arr2[] = new int[]{1,2,6,-1,0,9};

		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr1.length; i++){
		
			if(arr1[i] > max)
				max = arr1[i];
		}

		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr2.length; i++){
		
			if(arr2[i] < min)
				min = arr2[i];
		}

		int product = max * min;

		System.out.println(product);
	}
}
