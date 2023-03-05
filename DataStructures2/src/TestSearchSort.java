import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This is our main class 
 * @author Mohamed Jouini 040994664 2021-05-30 Lab 2 ,Professor : James Mwangi , Phd
 * 
 *
 */
public class TestSearchSort {
static int choice ;
static int sortingChoice;
/**
 * Our main method
 * @param args
 */
	public static void main(String[] args) {
		SortingAlgorithms sort =new SortingAlgorithms();
		 Scanner sc=new Scanner(System.in);
		 // new instance of our search class
	       Search s=new Search();
	       int arr[] = null;
	   
	       while(true)
	       {
	           System.out.println("Select your option int the menu below:\n"
	                        + "1.Initialize and populate an array of 30 random integers\n"
	                        + "2.Perform a recursive binary and linear search \n"
	                        + "3.Perfrom an iterative binary and linear search \n"
	                        + "4.Sort the array - Go to submenu \n"
	                        + "5.Exit");
	           // exception handling , input mismatch
	           try {
	        	   choice=sc.nextInt();
				
			} catch (InputMismatchException e) {
				
				System.err.println("*****Input mismatch******");
			sc.nextLine();
			}
	           int target;
	           switch (choice) {
			case 1:
				 arr=s.generateRandomInts();
                 System.out.println("Array of randomly generated integers:");
                 s.remainingElements(arr, 0, arr.length-1);
				break;
			case 2:
				 System.out.print("Please enter an integer value to search: ");
	                 target=sc.nextInt();
	                s.calculateTimeRecursive(arr, target);
	                s.calculateTimeRecursiveLinear(arr, target);
				break;
			case 3:
				   System.out.print("Please enter an integer value to search: ");
	                target=sc.nextInt();
	               s.calculateTimeIterative(arr, target);
	               s.calculateTimeIterativeLinear(arr, target);
				break;
			case 4:
				sort.sortEverything(sc);
				break;
			case 5:
				  System.exit(0);
				break;

			default:
				System.err.println("Please choose the option 1 to 5");
				break;
	           }
	     } 
	}
}
	