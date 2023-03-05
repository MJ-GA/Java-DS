import java.util.InputMismatchException;
import java.util.Scanner;

/**
*
* Description: This is our main method which will run with a menu that
* allows the user to make use of the inventory system    
*          <br>    
* Student Name:   Mohamed Jouini 
*  <br>
* Student Number: 040994664
*  <br>
* @author Mohamed Jouini
* 
*/
public class FoodItemTest {

   /**
   * Displays the menu.
   */
   private void displayMenu(){
       
       System.out.println("Please select one of the following:\n"
               + "1: Add Item to Inventory" + "\n"
               + "2: Display Current Inventory" + "\n"
               + "3: Buy Item(s)" + "\n"
               + "4: Sell Item(s)" + "\n"
               + "5: Search for Item" + "\n"
               + "6: Save Inventory to File" + "\n"
               + "7: Read Inventory from File" + "\n"
               + "8: To Exit");
   }

   /**
   * The main method.
   *
   * @param args Basic arguments
   */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       FoodItemTest program = new FoodItemTest();
       int userOption=0;
       int[] optionRange = {1, 8};

       Inventory inventory = new Inventory();

       while( userOption != optionRange[1]) {
           program.displayMenu();

           //get user input
           try {
               //check the string for whitespaces
               String userInput = scanner.nextLine(); 
               if (userInput.isEmpty()) {
                   throw new InputMismatchException();
               }
               userOption= Integer.valueOf(userInput);

           } catch (InputMismatchException x) {
               System.err.println("Please enter a valid integer");
               continue;
           } catch (NumberFormatException x) {
               System.err.println("Please enter an integer");
               continue;
           }


           // if acceptable input, perform the corresponding actions
           switch(userOption) {

         
           case 1:
               // Add Item to Inventory
               if (inventory.addItem(scanner, false)) {
                   //successful
                   System.out.println("Successfully added item to inventory");
               }
               break;
            
           case 2:
               // Display Current Inventory
               System.out.println("Inventory: \n" + inventory.toString());
               break;
               
           case 3:
               // Buy Item(s)
               if (inventory.updateQuantity(scanner, true)) {
                   //successful
                   System.out.println("Successfully bought item(s)");
               }
               break;
               
           case 4:
               // Sell Item(s)
               if (inventory.updateQuantity(scanner, false)) {
                   //successful
                   System.out.println("Successfully sold item(s)");
               }
               break;
               
           case 5:
               // Search for Item
               // view a FoodItem given the itemCode
               inventory.searchForItem(scanner);
               break;
              
           case 6:
               // Save Inventory to File
               inventory.saveToFile(scanner);
               break;
           case 7:
               // Read Inventory from File
               inventory.readFromFile(scanner);
               break;
               
           case 8: // the program terminates
               // To Exit
               System.out.println("Exiting...");
               break;
              
           default:
               // invalid number range
               System.out.println("Incorrect value entered");
           }
          
       }
       scanner.close(); // close Scanner
   }


}