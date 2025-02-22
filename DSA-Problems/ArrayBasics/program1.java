
// Search an element in an array


class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4};
		int x = 4;
		int found = 0;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] == x){
			
				found = i;
			}
		}

		if(found == 0){
		
			System.out.println("Element not found.");
		}else{
		
			System.out.println(found);
		}
	}

}
