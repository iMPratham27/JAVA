

// Leaders in an array

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{16,17,4,3,5,2};

		for(int i=0; i<arr.length; i++){
		
			int max = arr[i];
			boolean flag = false;

			for(int j=i+1; j<arr.length; j++){
			
				if(arr[j] > max)
					flag = true;
			}

			if(flag == false)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
