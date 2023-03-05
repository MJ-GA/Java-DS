import java.util.InputMismatchException;
import java.util.Scanner;
public class FoodItemTest
{
   /**
    *  Scanner class object created
    */
	static String buySell= "" ;
   static Scanner sc = new Scanner(System.in);
  static char choice  ;
  static String valid ="";
   /**
    *  Method to display menu, accept and return user choice
    * @return  user choice
    */
   static int menu()
   {
       System.out.println("\nPlease select one of the following: " +
           "\n 1: Add Item to Inventory \n 2: Display Current Inventory " +
           "\n 3: Buy Item(s) \n 4: Sell Item(s) \n 5: To Exit");
       return sc.nextInt();
   }// End of method
  
   // main method definition
   /**
    * Our main method
    * @param ss
    */
   public static void main(String ss[])
   {
       // Defines maximum capacity of food item
       final int MAX = 20;
       // Creates an array of object of class FoodItem of size MAX
       FoodItem fi[] = new FoodItem[MAX];
       int count = 0;
       int found = -1;
       int itemCode;
      
       // Loops till user choice is not 5
       while(true)
       {
          try {
			
		
           switch(menu())
           {
           
               case 1:
                   // Checks if current counter is equals to maximum size
                   // then displays error message and stop
                   if(count == MAX)
                   {
                       System.out.println("Inventory Full.");
                       break;
                   }
                   // Accepts the choice for type of food item
                  
                   do {
                	  
                	   System.out.print(valid+ "\nDo you wish to add a fruit(f), vegetable(v) or " +
                               "a preserve(p)?  ");
                	    choice = sc.next().charAt(0);
                	    valid ="Invalid Entry";
				} while (choice!='f' && choice!='v' && choice!='p' && choice!='V' && choice!='F' );
                   valid="";
                  
                   // Checks the type of food item
                   switch(choice)
                   {
                       case 'F':
                       case 'f':
                           // Creates an object of class Fruits
                           fi[count] = new Fruits();
                           // Calls the method to accept data for fruit
                           // increase the counter by one
                           fi[count++].addItem(sc);
                       break;
                       case 'V':
                       case 'v':
                           // Creates an object of class Vegetable
                           fi[count] = new Vegetable();
                           // Calls the method to accept data for fruit
                           // increase the counter by one
                           fi[count++].addItem(sc);
                       break;
                       case 'P':
                       case 'p':
                           // Creates an object of class Preserve
                           fi[count] = new Preserve();
                           // Calls the method to accept data for fruit
                           // increase the counter by one
                           fi[count++].addItem(sc);
                       break;
                       default:
                    	   System.out.print("\n Invalid Entry ");
                   }
                  
               break;
               case 2:
                   // Checks if current counter value is 0 then empty list
                   if(count == 0)
                       System.out.println("Inventory : \n");
                   // Loops till number of records (counter)
                   for(int c = 0; c < count; c++)
                   {
                       // Checks if found object is an instance of Fruits class object
                       if(fi[c] instanceof Fruits)
                       {
                           Fruits f = new Fruits();
                           // Converts current object to Fruits class object
                           f = (Fruits)fi[c];
                           // Displays data
                           System.out.println(f);
                       }
                       // Checks if found object is an instance of Vegetable class object
                       else if(fi[c] instanceof Vegetable)
                       {
                           Vegetable v = new Vegetable();
                           // Converts current object to Vegetable class object
                           v = (Vegetable)fi[c];
                           // Displays data
                           System.out.println(v);
                       }
                       // Checks if found object is an instance of Preserve class object
                       else if(fi[c] instanceof Preserve)
                       {
                           Preserve p = new Preserve();
                           // Converts current object to Preserve class object
                           p = (Preserve)fi[c];
                           // Displays data
                           System.out.println(p);
                       }
                   }
               break;
               case 3:
            	   buySell="buy";
                   // Accepts the item code
                   itemCode = fi[0].validatePositiveIntegerData(sc,
                       "\n Enter item code to update: ");
                  
                   // Checks if item code is not -1 then valid item code
                   if(itemCode != -1)
                   {
                       // Sets the found status to -1 for not found
                       found = -1;
                       // Loops till number of records
                       for(int c = 0; c < count; c++)
                       {
                           // Checks if current object item code is equals to
                           // user entered item code then update the found status
                           if(fi[c].isEqual(itemCode))
                               found = c;
                       }
                   }
                   // Checks if found status is -1 then not found
                   if(found == -1)
                   {
                       System.out.println("\n Code not found in inventory...");
                       break;
                   }
                   // Checks if found object is an instance of Fruits class object
                   if(fi[found] instanceof Fruits)
                   {
                       Fruits f = new Fruits();
                       // Converts found object to Fruits class object
                       f = (Fruits)fi[found];
                       // Calls the method to update quantity
                       // Second parameter true for purchase
                       f.updateQuantity(sc, true, fi, found);
                   }
                   // Otherwise checks if found object is an instance of
                   // Vegetable class object
                   else if(fi[found] instanceof Vegetable)
                   {
                       Vegetable v = new Vegetable();
                       // Converts found object to Vegetable class object
                       v = (Vegetable)fi[found];
                       // Calls the method to update quantity
                       // Second parameter true for purchase
                       v.updateQuantity(sc, true, fi, found);
                   }
                   // Otherwise found object is an instance of
                   // Preserve class object
                   else
                   {
                       Preserve p = new Preserve();
                       // Converts found object to Preserve class object
                       p = (Preserve)fi[found];
                       // Calls the method to update quantity
                       // Second parameter true for purchase
                       p.updateQuantity(sc, true, fi, found);
                   }              
               break;
               case 4:
            	   buySell ="sell";
                   // Accepts the item code
                   itemCode = fi[0].validatePositiveIntegerData(sc,
                           "\n Enter item code to update: ");
                  
                   // Checks if item code is not -1 then valid item code
                   if(itemCode != -1)
                   {
                       // Sets the found status to -1 for not found
                       found = -1;
                       // Loops till number of records
                       for(int c = 0; c < count; c++)
                       {
                           // Checks if current object item code is equals to
                           // user entered item code then update the found status
                           if(fi[c].isEqual(itemCode))
                               found = c;
                       }
                   }
                   // Checks if found status is -1 then not found
                   if(found == -1)
                   {
                       System.out.println("\n Code not found in inventory...");
                       break;
                   }
                   // Checks if found object is an instance of Fruits class object
                   if(fi[found] instanceof Fruits)
                   {
                       Fruits f = new Fruits();
                       // Calls the method to update quantity
                       // Second parameter false for sell
                       f.updateQuantity(sc, false, fi, found);
                   }
                   // Otherwise checks if found object is an instance of
                   // Vegetable class object
                   else if(fi[found] instanceof Vegetable)
                   {
                       Vegetable v = new Vegetable();
                       // Calls the method to update quantity
                       // Second parameter false for sell
                       v.updateQuantity(sc, false, fi, found);
                   }
                   // Otherwise found object is an instance of
                   // Preserve class object
                   else
                   {
                       Preserve p = new Preserve();
                       // Calls the method to update quantity
                       // Second parameter false for sell
                       p.updateQuantity(sc, false, fi, found);
                   }              
               break;
               case 5:
                   System.exit(0);
               default:
                   System.out.println("\n Invalid choice!");
           }} catch (NullPointerException e) {
        	   System.err.println("Error.....could not "+buySell+ " item  ");
   		} catch (ArithmeticException e1) {
			System.err.println("Arithmetic exception");
		}catch (InputMismatchException e2) {
			sc.nextLine();
			System.err.println("Input Mismatch");
		} catch (NumberFormatException e3) {
			System.err.println("Invalid Entry");
		}
       }// End of while loop
   }// End of main method
}// End of driver class