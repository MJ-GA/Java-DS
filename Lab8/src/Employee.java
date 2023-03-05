import java.util.Scanner; 
public class Employee extends Person
{
        /**
         * Employee number will be inherited by the Regular() and Contractor() employees.
         */
        protected int employeeNumber;
                
        Employee() 
        {
                
        }
        /**
         * initialization of the employee number with the user input in the Lab33 class.
         * @param employeeNumber refers to the employee number of the employee, whether Regular() or Contractor()
         */
        Employee (int employeeNumber) 
        {
                this.employeeNumber = employeeNumber;
        }
        
        /**
         * This method reads the employee information from the user, uses the Scanner object from the Lab33 class.
         * @param input is passed from the Store class to the readInfo method to allow for User input reading.
         */
        @Override
        public void readInfo(Scanner input) {
                
                System.out.print("Enter Employee Number: ");
                employeeNumber = input.nextInt();
                System.out.print("Enter First Name: ");
                firstName = input.next();
                System.out.print("Enter Last Name: ");
                lastName = input.next();
                System.out.print("Enter Email: ");
                email = input.next();
                System.out.print("Enter Phone Number ");
                phoneNumber = input.nextLong();
                
        }
        
        /**
         * This void method is used to print the information associated with the employee of the array index
         */
        public void printInfo() 
        {
                System.out.printf("%10d | %20s |%16s |%13s |", employeeNumber, getName(firstName, lastName), email, phoneNumber);
        }
        
        /**
         * readFile method that takes the input as a parameter to scan the values in the file.
         * @param input is passed to the readFile method to allow for file reading and variable assignment.
         */
        public void readFile(Scanner input) 
        {
                
                        employeeNumber = input.nextInt();
                        firstName = input.next();
                        lastName = input.next();
                        email = input.next();
                        phoneNumber = input.nextLong();         
                
        }
}