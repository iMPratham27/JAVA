
// right-max

class ArrayDemo{

        public static void main(String[] args){

                int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
                int N = 10;

                int rightMax[] = new int[N];
                rightMax[N-1] = arr[N-1];

                for(int i=N-2; i>=0; i--){

                        //rightMax[i] = max(rightMax[i+1] , arr[i])
                        if(arr[i] > rightMax[i+1])
                                rightMax[i] = arr[i];
                        else
                                rightMax[i] = rightMax[i+1];
                }

                for(int i=0; i<N; i++){

                        System.out.print(rightMax[i]+"\t");
                }
        }
}
