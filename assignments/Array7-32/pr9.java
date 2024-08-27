import java.util.*;
class C2W{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the col");
        int col = sc.nextInt();

        int arr [][] = new int[row][col];

        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                        arr[i][j]=sc.nextInt();

                }

        }
        int sum1=0;
	int sum2=0;
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                        if((i+j)==(row-1)){
                                sum1=sum1+arr[i][j];
                        }
		        if(i==j){
				sum2=sum2+arr[i][j];
			}
                }
        }

        System.out.println("product of sum of primary secondary diagonal "+sum1*sum2);
        }
}
