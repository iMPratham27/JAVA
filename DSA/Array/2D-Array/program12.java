
// print matrix in spiral fashion

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		int i = 0;
		int j = 0;
		int N = arr.length;

		while(N > 1){
		
			for(int x=0; x<N-1; x++){
			
				System.out.print(arr[i][j] + "  ");
				j++;
			}
			
			for(int x=0; x<N-1; x++){
			
				System.out.print(arr[i][j] + "  ");
				i++;
			}
			
			for(int x=0; x<N-1; x++){
			
				System.out.print(arr[i][j] + "  ");
				j--;
			}
			
			for(int x=0; x<N-1; x++){
			
				System.out.print(arr[i][j] + "  ");
				i--;
			}

			N = N - 2;
			i++;	// after one loop value of i,j becomes 0,0. So have next loop we increase value of i,j
			j++;
		}
		if(N==1)						
			System.out.print(arr[i][j] + "  ");	// to print remaining middle elements
	}
}
