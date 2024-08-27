
class ArrayDemo{

	public static void main(String[] args){
	
		//int A[] = new int[]{1,2,3,4,5};
		int A[] = new int[]{5,1,10,1};
		
		int totalProduct = 1;
		for(int i=0; i<A.length; i++){
		
			totalProduct = totalProduct * A[i];
		}

		
		for(int i=0; i<A.length; i++){
			int count = 0;
			for(int j=A[i]; j<=totalProduct; j=j+A[i]){
			
				count++;
			}

			System.out.print(count + " ");
		}
	}
}
