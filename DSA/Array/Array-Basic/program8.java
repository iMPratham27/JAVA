
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{9,12,23,10,12,12,15,23,14,12,15};
		int N = 11;

		for(int i=0; i<N; i++){
			
			int count = 1;
			
			for(int j=i+1; j<N; j++){
			
				if(arr[j]==arr[i])
					count++;
			}

			if(count%2==0 && count==2)
				System.out.println(arr[i]);
		}
	}
}
