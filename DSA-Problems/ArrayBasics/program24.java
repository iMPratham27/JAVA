
// Ceil the floor
// ceil => smallest but number just greater than given x (here 8)
// floor => largest but number just smaller than given x (here 6)

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{5,6,8,9,6,5,5,6};
		int ceil = -1;
		int floor = -1;
		int x = 7;

		for(int num : arr){
		
			if(num <= x){
			
				if(floor == -1 || num > floor)	
					floor = num;
			}

			if(num >= x){
			
				if(ceil == -1 || num < ceil)
					ceil = num;
			}
		}

		System.out.println(floor);
		System.out.println(ceil);
	}
}
