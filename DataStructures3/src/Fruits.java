import java.util.Scanner;
class Fruits extends FoodItem
{
	/**
	 *  Instance variables to store fruit information
	 */
   private String supplierName;
  
   /**
    *  Default constructor definition
    */
   Fruits()
   {
	   /**
	    *  Calls base class constructor
	    */
       super();
       supplierName = null;
   }// End of constructor
  
   /**
    *  Overrides super class method to accept data for preserve item
    */
   boolean addItem(Scanner sc)
   {
       // Calls the super class method addItem if it is success
       // then accept size of the jar
       if(super.addItem(sc))
       {
           // To skip new line character
           sc.nextLine();
           // Accepts farm supplier name
           System.out.print("\n Enter the name of the orchard supplier: ");
           supplierName = sc.nextLine();
          
           return true;
       }
       // Otherwise invalid data entered for food item
       else
           return false;      
   }// End of method
  
   /**
    *  Method to search parameter item code in the array of object FoodItem
    * @param fi
    * @param itemCode
    * @return the found index position otherwise returns -1
    */
 
   int alreadyExists(FoodItem fi[], int itemCode)
   {
       // Loops till end of the array
       for(int c = 0; c < fi.length; c++)
           // Checks if parameter item code is equals to current object item code
           // return loop variable as found index position
           if(fi[c].isEqual(itemCode))
               return c;
       // Otherwise return -1 for not found
       return -1;
   }// End of method
  
   /**
    *  Method to update quantity of an item based of parameter index position 
    * @param sc
    * @param type
    * @param fi
    * @param pos
    * @return
    */
   boolean updateQuantity(Scanner sc, boolean type, FoodItem fi[], int pos)
   {
       // Calls the method to quantity to update
       // stores the return data
       int qty = validatePositiveIntegerData(sc,
               "\n Enter quantity to: ");
       // Checks if return data is not -1 and update type is true then buy
       if(qty != -1 && type == true)
       {
           // Calls the method to update quantity
           updateItem(qty);
           return true;
       }
       // Otherwise checks if return data is not -1 and update type is false then sell
       else if(qty != -1 && type == false)
       {
           // Calls the method to update quantity with negative quantity
           updateItem(-qty);
           return true;
       }
       // Otherwise displays error message
       else
       {
           if(type == true)
               System.out.println("\n Error...could not buy item");
           else
               System.out.println("\n Error...could not sell item");
           return false;
       }
   }// End of method

   /**
    *  Overrides toString() method to return fruit item information
    */
   public String toString()
   {
       return "\n Fruit item: " + super.toString() +
               "\n orchard supplier: " + supplierName;
   }// End of method
}// End of class