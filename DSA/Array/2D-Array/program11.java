
// print boundary elements in clockwise manner

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int i = 0;
		int j = 0;
		int N = arr.length;

		for(int x=0; x<N-1; x++){
		
			System.out.print(arr[i][j] + "  ");
			j++;
		}
		
		//System.out.print(i);
		//System.out.print(j + "  ");

		for(int x=0; x<N-1; x++){
		
			System.out.print(arr[i][j] + "  ");
			i++;
		}
		//System.out.print(i);
		//System.out.print(j + "  ");
		
		for(int x=0; x<N-1; x++){
		
			System.out.print(arr[i][j] + "  ");
			j--;
		}
		//System.out.print(i);
		//System.out.print(j + "  ");
		
		for(int x=0; x<N-1; x++){
		
			System.out.print(arr[i][j] + "  ");
			i--;
		}
		//System.out.print(i);
		//System.out.print(j + "  ");
	}
}
