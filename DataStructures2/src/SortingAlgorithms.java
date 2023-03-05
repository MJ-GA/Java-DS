import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This class contains all the necessary sorting algorithms for lab 3
 * @author Mohamed Jouini
 *
 */
public class SortingAlgorithms {
	static int sortingChoice=0;
	public SortingAlgorithms() {
			}
	/**
	 *  implementation of Bubble Sort
	 * @param arr copy of our array 
	 */
void bubbleSort(int[] arr) {  
		int n = arr.length;  
	 	int temp = 0;  
	 	for(int i=0; i < n; i++){  
	 		for(int j=1; j < (n-i); j++){  
	 			if(arr[j-1] > arr[j]){  
	 				//swap elements  
	 				temp = arr[j-1];  
	 				arr[j-1] = arr[j];  
	 				arr[j] = temp;  
	 			}                 
	 		}  
	 	}  
	}
/**
 *   implementation of insertion Sort
 * @param arr copy of our array 
 */
 void insertionSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
 /**
	 *   implementation of selection Sort
	 * @param arr copy of our array 
	 */
 void selectionSort(int arr[])
	    {
	        int n = arr.length;

	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	 
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        	}
	    	}	
 /**
  * 
  * @param arr	copy of array
  * @param l	left
  * @param m	medium
  * @param r	right
  */
void merge(int arr[], int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        /* Create temp arrays */
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	 
	        /* Merge the temp arrays */
	 
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	 
	        // Initial index of merged subarry array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
/**
 * 
 * @param arr	copy of array
 * @param l		left of array
 * @param r		right of array
 */
void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m =l+ (r-l)/2;
	 
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	 
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
/**
 * this is a method that makes swapping array elements faster 
 * @param arr	copy of array
 * @param i		first element index
 * @param j		second element index
 */
void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
/** This function takes last element as pivot, places
the pivot element at its correct position in sorted
array, and places all smaller (smaller than pivot)
to left of pivot and all greater elements to right
of pivot */
/**
 *  Java program for implementation of Bubble Sort
 * @param arr copy of our array 
 */
int partition(int[] arr, int low, int high)
{
     
    // pivot
    int pivot = arr[high];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
         
        // If current element is smaller
        // than the pivot
        if (arr[j] < pivot)
        {
             
            // Increment index of
            // smaller element
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}

/**
 * The main function that implements QuickSort
 * @param arr Array to be sorted,
 * @param low Starting index,
 * @param high Ending index
 */
void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
         
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    	}
	}
/**
 * This is the submenu main method
 * @param sc	Scanner
 * @param sortingChoice	User's submenu Choice 
 */
void sortEverything (Scanner sc) {
	
			System.out.println("Select your option int the menu below:\n"
		            + "B. Bubble Sort \n"
		            + "I. Insertion Sort \n"
		            + "S. Selection Sort \n"
		            + "M. Merge Sort \n"
		            + "Q. Quick Sort \n"
		            + "R. Return to Main Menu");
			
			try {
		    	   sortingChoice=sc.nextInt();
				
			} catch (InputMismatchException e) {
				
				System.err.println("*****Input mismatch******");

			}
			switch (sortingChoice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			default:
				System.err.println("Please choose an option from the list");
				break;
			}
			
		}
}

	

	  
	    


