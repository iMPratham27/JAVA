
// Maximum product of two numbers


class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,100,42,4,23};

		int max = -1;
		int secMax = -1;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] > max)
				max = arr[i];
		}

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] > secMax && arr[i]!=max)
				secMax = arr[i];
		}
	
		int product = max * secMax;

		System.out.println(product);
	}
}
