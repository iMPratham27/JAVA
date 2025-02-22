

// First and last occurance of x


class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,3,3,4};
		int x = 3;
		int first_occur = 0;
		int second_occur = 0;

		for(int i=0; i<arr.length; i++){
		
			if(arr[i] == x){
			
				first_occur = i;
				break;
			}
		}

		for(int i=first_occur+1; i<arr.length; i++){
		
			if(arr[i] == x){
			
				second_occur = i;
			}
		}

		if(first_occur == 0 && second_occur == 0)
			System.out.println("-1");
		else
			System.out.println(first_occur + " " + second_occur);
	}
}
