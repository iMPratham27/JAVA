
// sum of entire matrix

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr.length; j++){
			
				sum = sum + arr[i][j];
			}
		}

		System.out.println("Sum: "+ sum);
	}
}
