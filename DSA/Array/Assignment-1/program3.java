
class ArrayDemo{

	public static void main(String[] args){
	
		//int A[] = new int[]{1,2,3,4,5};
		//int B[][] = new int[][]{{0,3},{1,2}};
		
		int A[] = new int[]{2,2,2};
		int B[][] = new int[][]{{0,0},{1,2}};

		for(int i=0; i<B.length; i++){
		
			int startIdx = B[i][0];
			int endIdx = B[i][1];

			int sum = 0;
			for(int j=startIdx; j<=endIdx; j++){
			
				sum = sum + A[j];
			}
			System.out.print(sum +" ");
		}	
	}
}
