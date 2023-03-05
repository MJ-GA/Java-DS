import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
/** 
 * This class contains all the necessary search operations we need for this lab 
 * @author Mohamed Jouini 040994664 2021-05-30 Lab 2 ,Professor : James Mwangi , Phd
 * 
 *
 */
class Search{
        
        /**
         * Iterative Binary Search
         * @param arr  Table
         * @param target This is the element we're looking for 
         * @return Target found or not found
         */
        public int IterativeBinarySearch(int arr[],int target)
        {
                int low=0,high=arr.length-1;
                while(low<=high)
                {
                        remainingElements(arr,low,high);
                        int mid=(low+high)/2;
                        if(arr[mid]==target)
                        {
                                System.out.println("Number "+target +" is found at index "+mid+" :Iterative binary search");
                                return mid;
                        }
                        else if(arr[mid]<target)
                                low=mid+1;
                        else
                                high=mid-1;
                }
                System.out.println("Number "+target+" was not found :Iterative binary search");
                return -1;
        }
        
        /**
         * Recursive Binary Search
         * @param arr Table
         * @param first First element in the table
         * @param last last element in the table
         * @param target the element we're looking for
         * @return Target found or not found
         */
        public int recursiveBinarySearch(int arr[],int first,int last,int target)
        {
                if(first<=last)
                {
                        remainingElements(arr,first,last);
                        int mid=(first+last)/2;
                        if(arr[mid]==target)
                        {
                                System.out.println("Number "+target +" is found at index "+mid+" :Recursive binary search");
                                return mid;
                        }
                        else if(arr[mid]<target)
                                return recursiveBinarySearch(arr,mid+1,last,target);
                        else
                                return recursiveBinarySearch(arr,first,mid-1,target);
                }
                // if not found
                System.out.println("Number "+target +" is not found :Recursive binary search");
                return -1;
                
        }
        /**
         *  Iterative Linear Search
         *  @param arr Table
         * @param length Length of the table
         * @param target the element we're looking for
         * @return Target found or not found
         */
        public int iterativeLinearSearch (int arr[],int length ,int target) {
        	
        	for (int i=0;i<=arr.length-1;i++) {
        		if (arr[i]==target) {
        			System.out.println("Number "+target +" is found at index "+i+" :Iterative Linear search");
        			return i;
        		}
        }
        	System.out.println("Number "+target+" was not found :Iterative linear search");
			return 0;
        	}
        /**
         * Recursive Linear Search
         * @param arr Table
         * @param l first element from the left
         * @param r first element from the right
         * @param x the element we're looking for
         * @return Target found or not found
         */
        public int recursiveLinearSearch(int arr[], int l, int r,int x)
        {
        	// if r<l,it means that element is not present in
        	// the array
        	if (r < l) {
        		System.out.println("Number "+x+" was not found :Recursive Linear search");
        		return -1;}
        	if (arr[l] == x) {
        		System.out.println("Number "+x +" is found at index "+l+" :Recursive Linear search");
        		return l;}
        	if (arr[r] == x)
        		return r;
        	return recursiveLinearSearch(arr, l + 1, r - 1, x); }
        /**
         * Remaining Elements
         * @param arr Table
         * @param l first element from the left
         * @param r first element from the right
         */
        public void remainingElements(int arr[],int l,int r)
        {
                for(int i=l;i<=r;i++)
                        System.out.print(arr[i]+" ");
                System.out.println();
        }
        /**
         * This method generates random integers
         * @return table
         */
        int[] generateRandomInts()
        {
                int arr[]=new int[30];
                Random rand=new Random();
                for(int i=0;i<30;i++)
                        arr[i]=rand.nextInt(89)+11; // generate between 11 to 99
                // sort the array
                Arrays.sort(arr);
                return arr;
        }
        /**
         * This method calculates the time taken for the Recursive Binary method
         * @param arr Table
         * @param target element we're looking for
         */
        public void calculateTimeRecursive(int arr[],int target)
        {
              
                long start=System.nanoTime();
                recursiveBinarySearch(arr,0,arr.length-1,target);
                long time=System.nanoTime()-start;
                System.out.println("Time taken in nanoseconds "+time+"ns");
                
            start=System.currentTimeMillis();
                
                time=System.currentTimeMillis()-start;
                System.out.println("Time taken in milliseconds "+time+"ms");
               
                      
        }
        /**
         * calculates Time for Recursive Linear method
         * @param arr Table
         * @param target element we're looking for
         */
        public void calculateTimeRecursiveLinear(int arr[],int target)
        {
              
                long start=System.nanoTime();
                recursiveLinearSearch(arr,0,arr.length-1,target);
                long time=System.nanoTime()-start;
                System.out.println("Time taken in nanoseconds "+time+"ns");
                start=System.currentTimeMillis();
                time=System.currentTimeMillis()-start;
                System.out.println("Time taken in milliseconds "+time+"ms");
               
                      
        }
        /**
         * calculates Time for Iterative linear
         * @param arr table
         * @param target element we're looking for
         */
        public void calculateTimeIterativeLinear(int arr[],int target)
        {
              
                long start=System.nanoTime();
                iterativeLinearSearch(arr,arr.length-1,target);
                long time=System.nanoTime()-start;
                System.out.println("Time taken in nanoseconds "+time+"ns");
                start=System.currentTimeMillis();
                time=System.currentTimeMillis()-start;
                System.out.println("Time taken in milliseconds "+time+"ms");
               
                      
        }
        /**
         * calculates Time for Iterative binary
         * @param arr Table
         * @param target element we're looking for
         */
        public void calculateTimeIterative(int arr[],int target)
        {
        long start=System.nanoTime();
        start=System.nanoTime();
        IterativeBinarySearch(arr,target);
        long time=System.nanoTime()-start;
        System.out.println("Time taken in nanoseconds "+time+"ns");
        
    start=System.currentTimeMillis();
      
        time=System.currentTimeMillis()-start;
        System.out.println("Time taken in milliseconds "+time+"ms");
        }
}