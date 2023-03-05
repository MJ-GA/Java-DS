import java.util.Scanner;
abstract class Person 
{
        protected String firstName;
        protected String lastName;
        protected String email;
        protected long phoneNumber;
        protected String type; //type of employee read from file
        
        Person() 
        {
                
        }
        /**
         * Parameterized constructor of the Person() Class
         * @param firstName User's first name
         * @param lastName User's last name
         * @param email User's email
         * @param phoneNumber User's phone number
         */
        Person(String firstName, String lastName, String email, long phoneNumber) 
        {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.phoneNumber = phoneNumber;
        }
        
        /**
         * Method used as a getter to return the name of the Person altogether, first + last name
         * @param firstName is the employee indexed's first name
         * @param lastName is the employee indexed's last name
         * @return returns getName method
         */
        public String getName(String firstName, String lastName) 
        {
                return firstName + " " + lastName;
        }
        
        /**
         * This method reads each individuals information, it is a void method that accepts and returns nothing.
         * @param input user input from the scanner object in the main method of Lab33
         */
        public void readInfo(Scanner input)
        {
                
        }
        
        /**
         * Abstract method that is accessed from the child class of the Person class.
         */
        public abstract void printInfo();
        
}