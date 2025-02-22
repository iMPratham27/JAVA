
// Find minimum and maximum element in an array


class ArrayDemo{

	public static void main(String[] args){
	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int arr[] = new int[]{3,2,1,56,10000,167};

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] > max)
				max = arr[i];

			if(arr[i] < min)
				min = arr[i];
		}

		System.out.println("Max : "+ max + " and Min : " + min);
	}
}
