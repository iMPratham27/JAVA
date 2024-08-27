
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,12,15,6,7,10,9};

		for(int i=0; i<arr.length; i++){
		
			if(arr[i]%2==0){
			
				arr[i]=0;
			}else{
			
				arr[i]=1;
			}

			System.out.print(arr[i]+"\t");
		}

		
	}
}
