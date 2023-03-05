import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Contains main method
 * @author Mohamed Jouini
 *
 */
public class BinaryTreeExample {
/**
 * main method
 */
   public static void main(String[] args) {
	   //Scanner object 
       Scanner keyboard = new Scanner(System.in);
       keyboard.useDelimiter(Pattern.compile("[\\n\\r]+"));
       BinaryTree tree = new BinaryTree();

       int choice = 0;
       while(choice != 4)
       {
           displayMenu();
           //check if user input has the following values
           if(keyboard.hasNext(Pattern.compile("[1-4]")))
           {
        	   //Read user's input 
               choice = keyboard.nextInt();
               
               //Switch based on user's input
               switch(choice)
               {
               case 1: // Add Value to Tree
                   boolean valid = false;
                   while(!valid)
                   {
                       System.out.print("Enter an integer to add to the tree: ");
                       
                       //handling potential wrong input
                       if(keyboard.hasNextInt())
                       {
                    	   
                           valid = true;
                           int toAdd = keyboard.nextInt();
                           tree.insertInTree(toAdd);
                       }
                       else
                       {
                           System.out.println("Invalid integer");
                           valid = false;
                           keyboard.next();
                       }
                   }
                   break;
               case 2: // Display Tree (In-Order Traversal)
                   System.out.println("Tree Traversal");
                   tree.displayInOrder();
                   System.out.println();
                   break;
               case 3: // display the height of the tree
                    System.out.println("The height of the tree: ");
                    System.out.println( tree.getTreeHeight() );
                    break;
               case 4:
            	   //Exits the program
                   System.out.println("Exiting...");
                   break;
               default:
                   break;
               }
           }
           // if user input is is not a valid integer
           else
           {
               System.out.println("Invalid choice");
               choice = 0;
               keyboard.next();
           }
       }
       keyboard.close();
   }

   /**
   * Displays menu to screen
   */
   public static void displayMenu()
   { 
	   //User menu too choose from
       System.out.println("1: Add Value to Tree");
       System.out.println("2: Display Tree (In-Order Traversal)");
       System.out.println("3: Display height of the Tree");
       System.out.println("4: To Exit");
       System.out.print("> ");
   }
}