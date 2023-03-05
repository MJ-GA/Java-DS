import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab9 
{
        public static String storeName;
        public static void main(String[] args) 
        {
                int num = 0; 
                int choice = 0;
                /**
                 * This Scanner object will be passed throughout the program, used as the only source 
                 * for scanning user input and reading files.
                 */
                Scanner input = new Scanner(System.in);
                System.out.print("Enter Name of the Store: ");
                storeName = input.next();
                while (num <= 0) 
                {
                        /**
                         * try-catch block used to observe for any exceptions to the num of employees (negative employee count, non-integer employee counts
                         */
                        try 
                        {
                                System.out.print("How many Employees do you have? ");
                                num = input.nextInt();
                        } catch (InputMismatchException x) 
                        {
                                System.err.println("******Input Mismatch Exception while reading number of employees...*****");                          
                                input.next();
                        }
                }
                //New object called store, that holds the number of employees.
                Store store = new Store(num);
                /**
                 * This loop is the menu for the program.
                 * choice == 1 allows for user input 
                 * choice == 2 allows for opening/ reading the file
                 * choice == 3 displays information that was prompted by the user, either choice 1 or choice 2 values
                 * choice == 4 exits the program
                 */
                while (choice != 4) 
                {
                        /** Try block used to catch invalid menu options */
                        try 
                        {
                                System.out.print("1. Read Employee Details from the User\n2. Read Details from the File\n3. Print Employee Details\n4. Quit\nEnter your option :  ");
                                choice = input.nextInt();
                        } catch (InputMismatchException here) 
                        {
                 
                                System.err.println("*****Input Mismatch Exception while reading selection of process*****");                             
                                input.next();
                        }
                        //Choice #1 is user input for employee information
                        if (choice == 1) 
                        {
                                store.readDetails(input);
                        }
                        //Choice #2 is reading file for employee information
                        else if (choice == 2) 
                        {
                                store.openFile(input); //calls openFile() method in the Store class and passes the input Scanner object
                        }
                        //Choice #3 prints employees that were called
                        else if (choice == 3) 
                        {
                                store.printTitle();
                                if (store.isArrayEmpty() == false)
                                        store.printDetails();
                        }
                        //exits the menu screen
                        else if (choice == 4) 
                        {
                                System.out.println("Goodbye... Have a nice day!");
                        }
                        // reminding the user that the choice selected is not a menu option.
                        else 
                        {
                                System.err.println("Invalid option... please try again...");
                        }
                        
                        
                } 
                //close the file
                input.close();
        }
}

