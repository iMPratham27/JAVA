import java.util.*;
class arrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size of Array: ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.print("Enter the Elements: ");
                for(int i=0;i<size;i++){

                        arr[i] = sc.nextInt();

                }
                int idx=-1;
                for(int  i=0;i<size;i++){
			for(int j=i+1;j<size;j++){

                if(arr[i]==arr[j]){
                        idx=i;
			break;

                }


            }
	    

                }
		 if(idx!=-1){

            System.out.print("first duplicate element at index "+idx);
            }

        }
}
