package DSA.Sorting;

import java.util.Random;

class QuickSort {

    static int partition(int start, int end, int arr[]){

        /* pivotIndex can be start, 
                             end, 
                             random . use this  start + new Random().nextInt(end-start+1) 
        */
        int pivotIndex = end;
        
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;

        int pivot = arr[end];
        int i = start - 1; // finds correct position of pivot

        for(int j=start; j<end; j++){

            // here swapping helps to put elements to left which are smaller than left           
            if(arr[j] <= pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
      
        temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }

    static void quickSort(int start, int end, int arr[]){

        if(start < end){

            int pivotIdx = partition(start, end, arr);

            quickSort(start, pivotIdx-1, arr);
            quickSort(pivotIdx+1, end, arr);
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {12,7,6,14,5,15,10};

        int start = 0;
        int end = arr.length-1;

        quickSort(start, end, arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
