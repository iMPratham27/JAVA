
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,4,5,6,11,9,10};

		System.out.println("Output: ");
		int product = 1;
		for(int i=0; i<arr.length; i++){
		
			int count = 0;
			for(int j=1; j<=arr[i]; j++){
			
				if(arr[i]%j==0){
				
					count++;
				}
			}

			if(count==2){
			
				product = product * arr[i];
			}
		}

		System.out.println("Product of prime numbers: "+ product);
	}
}
