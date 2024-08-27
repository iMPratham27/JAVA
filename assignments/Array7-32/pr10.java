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
                for(int j=0;j<arr.length;j++){
                        if(i==0 && j==0 || i==0 && j==row-1 || j==0 && i==row-1 ||i==row-1 && j==col-1){
                                System.out.print(arr[i][j]+" ");
                        }
                }
        }
        
        }

}
