import java.util.Scanner;
// Defines super class FoodItem
class FoodItem
{
	static String valid ="";
   // Instance variables to store food item information
   private int itemCode;
   private String itemName;
   private int itemQuantityInStock;
   private double cost;
   private double salesPrice;
  
   // Default constructor definition
   public FoodItem()
   {
       itemCode = itemQuantityInStock = 0;
       itemName = null;
       cost = salesPrice = 0.0;
   }// End of default constructor
  
   // Method to return the valid integer entered by the user
   // Returns -1 for invalid data
   // Otherwise returns the valid integer
   int validatePositiveIntegerData(Scanner sc, String message)
   {
       String input = "";
 int data = 0;
// Displays the message
       System.out.print(message);

       // Loops till integer data entered by the user
while(!sc.hasNextInt() )
{
   input = sc.next();
   System.out.println("\n Invalid Entry. \n"+message);
}

	
	    input = sc.next();
	   data = Integer.parseInt(input);
	   if (!(message.equals( "\n Enter the code for the item: "))) {
	  while(data < 0)
	   {
	       System.out.println(" Invalid Entry.\n"+message);
	       input = sc.next();
		   data = Integer.parseInt(input);
	   }}
	   



// Converts to integer
   data = Integer.parseInt(input);
   // Checks if data is negative returns -1
  
   // Returns the integer
return data;
   }// End of method
  
   // Method to return the valid integer entered by the user
   // Returns -1 for invalid data
   // Otherwise returns the valid integer
   private double validatePositiveDoubleData(Scanner sc, String message)
   {
	   
       String input = "";
       double data;
       // Displays the message
System.out.print(message);
// Loops till double data entered by the user
while (!sc.hasNextDouble())
{
   input = sc.next();
   System.out.println(" Invalid Entry");
   System.out.println(message);
   
}
// Accepts data
input = sc.next();
// Converts to double
   
   
   data = Double.parseDouble(input);
   if (!(message.equals( "\n Enter the code for the item: "))) {
  while(data < 0)
   {
       System.out.println(" Invalid Entry.\n"+message);
       input = sc.next();
	   data = Double.parseDouble(input);
   }}
return data;
   }// End of method
  
   // Method to accept data from the user
   // Returns true for success otherwise returns false
   boolean addItem(Scanner sc)
   {
       // Calls the method to accept valid item code
       // stores the return data
       int intData = validatePositiveIntegerData(sc, "\n Enter the code for the item: ");

       // Checks if return data is not -1 then valid item code return true
       if(intData != -1)
           itemCode = intData;
       // Otherwise returns false
       else
           return false;
      
       // To skip new line character
       sc.nextLine();
      
       // Accepts name of the item
       System.out.print("\n Enter the name for the item: ");
       itemName = sc.nextLine();
      
     
    	   intData = validatePositiveIntegerData(sc, valid+"\n Enter the quantity for the item: ");
    
      
       // Checks if return data is not -1 then valid item code return true
       if(intData != -1)
           itemQuantityInStock = intData;
       // Otherwise returns false
       else
           return false;      
      
       // Calls the method to accept valid cost
       // stores the return data
       double doubleData = validatePositiveDoubleData(sc, "\n Enter the cost of the item: ");
      
       // Checks if return data is not -1 then valid item code return true
       if(doubleData != -1.0)
           cost = doubleData;
       // Otherwise returns false
       else
           return false;
      
       // Calls the method to accept valid price
       // stores the return data
       doubleData = validatePositiveDoubleData(sc, "\n Enter the sales price of the item: ");
       if(doubleData != -1.0)
           salesPrice = doubleData;
       // Otherwise returns false
       else
           return false;
       return true;      
   }// End of method
  
   // Method to update quantity
   // Returns true for success otherwise returns false
   boolean updateItem(int qty)
   {
       // Adds parameter quantity with current quantity if it is equals to 0
       // Display error message and return false
       if((qty + itemQuantityInStock) == 0)
       {
           System.out.println("\n Cannot sell quantity becomes 0");
           return false;
       }
       // Otherwise update the quantity by adding parameter quantity
       // with current quantity and returns true
       else
       {
           qty += itemQuantityInStock;
           return true;
       }
   }// End of method
  
   // Method to return true if parameter item code is equals to
   // implicit object item code
   boolean isEqual(int itemCode)
   {
       return (itemCode == this.itemCode);
   }// End of method
  
   // Method to accept item code from the user
   // Returns true for success otherwise returns false
   boolean inputCode(Scanner sc)
   {
       // Calls the method to accept valid item code
       // stores the return data
       int intData = validatePositiveIntegerData(sc, "\n Enter the code for the item: ");
      
       // Checks if return data is not -1 then valid item code return true
       if(intData != -1)
           return true;
       // Otherwise returns false
       else
           return false;
   }// End of method
  
   // Overrides toString() method to return food item information
   public String toString()
   {
       return "\n Item: " + itemCode + " " + itemName + " " + itemQuantityInStock +
               " price: $ " + String.format("%.2f", salesPrice) +
               " cost: $" + String.format("%.2f", cost);
   }// End of method
}// End of class