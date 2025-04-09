
import java.util.*;

class QuickSort{
	/*
	Rearrange the elements such that:
	All elements less than or equal to pivot go to the left
	All elements greater than pivot go to the right
	Pivot goes in the middle, at its correct sorted position
	*/
	int partition(int arr[], int start, int end){
	
		int pivot = arr[end];

		int i = start - 1;

		for(int j=start; j<end; j++){
		
			if(arr[j] <= pivot){
			
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;

		return i+1;
	}

	void quickSort(int arr[], int start, int end){
	
		if(start < end){
		
			int pivotIdx = partition(arr,start,end);//in this function, pivotIdx is placed at the correct position

			//Repeat the above steps on the left and right parts of the array, excluding the pivot (it’s already in correct place!).
			quickSort(arr,start,pivotIdx-1);
			quickSort(arr,pivotIdx+1,end);
		}
	}

	public static void main(String[] args){
	
		int arr[] = new int[]{12,7,6,14,5,15,10};

		System.out.println(Arrays.toString(arr));//it is used to print the array in String format(print array without forloop)

		QuickSort obj = new QuickSort();
		obj.quickSort(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
}
