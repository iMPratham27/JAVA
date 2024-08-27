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
        for(int i=0;i<arr.length;i++){
                int sum = 0;
                for(int j=0;j<arr.length;j++){
                        sum=sum+arr[j][i];
		}
		System.out.println("sum is col :"+(i+1)+" "+sum);
		
        }
        }

}
