
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * This class contains the main method 
 * @author Mohamed Jouini
 *
 */
public class Main
{
	/**
	 * This function displays the menu 
	 */
    public static void displayMenu() // Function to display menu in then loop
    {
        System.out.println("1. Add a String to the array dataItems");
        System.out.println("2: Search for a string in the array");
        System.out.println("3: Exit");
        System.out.print("> ");
    }
    /**
     * Main method which contains a loop to iterate through different options
     * @param args args
     */
   public static void main(String[] args)
   {
	   
       ArrayList<String> dataItems = new ArrayList<String>(100); 
       // Hashing class object instance
       Hashing hashing=new Hashing();
       //Scanner to read user input
       Scanner input = new Scanner(System.in);
       //Second Arraylist to make it easier to manipulate dataItems
       ArrayList<LinkedList<String>> myList = new ArrayList<LinkedList<String>>(100);

       for (int i= 0; i < 100; i++) //Fills the arrayList with empty string objects
           myList.add(i, new LinkedList<String>());

       int option = 0; // User option variable
       while(option != 3) // Loop menu
       {
 
           displayMenu(); // Displays the Menu 
           if(input.hasNext(Pattern.compile("[1-3]")))
           {
               option = input.nextInt();
               switch(option)
               {
               case 1: // Add String to array dataItems
                   if(!hashing.addString(input, dataItems, myList));
                   break;
               case 2: // Search for a string in the array dataItems
                   hashing.search_element(input, myList);
                   break;
               case 3: // Quit
               System.out.println("Exiting...");
                   break;
               default: 
                   break;
               }
           }
           else
           {
               System.err.println("Invalid menu option\n");
               option = 0;
               input.next();
           }
       }
       input.close(); //Closes the scanner
   }

  

  
}