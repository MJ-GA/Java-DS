import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This class contains all the hash/add/search/print operations.
 * @author Mohamed Jouini
 *
 */
public class Hashing {
	/**
	 * Constructor
	 */
	public Hashing() {}
	
	 
/**
 * This method check if the arraylist contains a particular string and returns true if it exists
 * @param myList Arraylist 
 * @param temp String to search for
 * @param index	index of the element to search for
 * @return	true if string exists in list, False if it doesn't
 */
	   public static boolean search(ArrayList<LinkedList<String>> myList, String temp, int index)
	   {
	       if (myList.get(index).contains(temp)) // Returns true if the list contains the string
	           return true;
	       else
	           return false;
	   }
	  /**
	   * This function will permit us to add a string to the Arraylist and checks if it already exists
	   * @param input Scanner 
	   * @param dataItems Main Arraylist
	   * @param myList Secondary Arraylist
	   * @return False if the string exists, True if it doesn't
	   */
	   public static boolean addString(Scanner input, ArrayList<String> dataItems, ArrayList<LinkedList<String>> myList)
	   {
	       boolean valid = true; // variable to return 

	       System.out.println("Enter String to insert: ");
	       String temp = input.next();
	       int index = hash(temp);
	       int counter=0; // counter to be used in printing.
	       
	       if (!search (myList, temp, index)) // Check if the number already exists in the table
	       {
	           if(myList.get(index).isEmpty())
	           {  
	           myList.get(index).add(temp); // If the number doesn't exist in the first table then add it to the second table.
	           valid = true;
	           }
	           else if (!myList.get(index).isEmpty())
	           {
	               myList.get(index+1).add(temp); // If the hash does not exist inside the table insert it into the the ArrayList
	               valid = true;
	           }
	           else
	       {
	           System.err.println ("String " + temp + " already exists" + index + "\n"); // if number already exist
	           valid = false;
	       }

	      
	   }
	       System.out.print("Table: {"); 
	       for(int i=99;i>=1;--i) //Loop to print the current state of Arraylist
	       { 
	       if (myList.get(i) !=null && !myList.get(i).isEmpty() ){
	    	 
	    	   if (counter!=0)
	       	System.out.print(", "+i+"="+myList.get(i));  //Print correct format
	    	   else
	    		   System.out.print(i+"="+myList.get(i));
	    	   counter++;
	       }
	       }
	       System.out.println("}");
	       return valid;
	}

	   
/**
 * This function will help us perform a search for a particular string in the Arraylist
 * @param input Scanner
 * @param myList Arraylist
 * @return	the index of the element being searched
 */
	   public static int search_element(Scanner input, ArrayList<LinkedList<String>> myList)
	   {
	       int element_position = 0; // index of element searched
	       String element_searched; //the element the user wants to search
	       int counter=0; // counter to be used for printing the list

	       System.out.print("Enter a String to search for: ");
	       element_searched = input.next();
	       element_position = hash(element_searched); // put the index into a variable by calling the hash method
	      
	       if (search (myList, element_searched, element_position )) //  if the element exists inside the list display message
	           System.out.println ("'"+element_searched + "' is at index " + element_position);
	       else
	           System.out.println ("'"+element_searched+"' does not exist in the array "); // else prints this message instead
	       System.out.print("Table: {"); // List printing format 
	       for(int i=99;i>=1;--i) //print occupied elements of the list in the desired format
	       { 
	       if (myList.get(i) !=null && !myList.get(i).isEmpty() ){ //only prints elements that are not null and not empty
	    	  
	    	   if (counter!=0)
	       	System.out.print(", "+i+"="+myList.get(i));
	    	   else
	    		   System.out.print(i+"="+myList.get(i));
	    	   counter++;
	       }
	       }
	       System.out.println("}");
	       return element_position;
	   }
	   /**
	    * This method will convert the string into a hash
	    * @param hash String to be converted into a hash
	    * @return hash value
	    */
	   public static int hash(String hash)
	   {
	       int total = 0;

	           if(hash.length() == 1)               // Takes the first and return hash // Or first and second characters of the string and add them and then return hash
	               total += (int)hash.charAt(0);
	           else
	               total += (int)hash.charAt(0) + (int)hash.charAt(1);
	       
	       return total % 100;   // returns the hash 
	   }
}
