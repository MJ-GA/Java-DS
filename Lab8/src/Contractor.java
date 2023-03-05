import java.util.NoSuchElementException;
import java.util.Scanner;
public class Contractor extends Employee 
{
        /**
         * Attributes exclusive to the contractor class
         */
        private double hourlyRate;
        private double numHours;
        
        /** Default method
         * 
         */
        Contractor() 
        {
                
        }
        /**
         * readInfo is passed the input parameter from the Lab9 class to read user input.
         * super key references to the parent class, Contractor()
         * @param input passed to the readInfo class to read user input.
         */
        @Override
        public void readInfo(Scanner input) 
        {
                try 
                {
                super.readInfo(input);
                System.out.print("Enter Hourly Rate: ");
                hourlyRate = input.nextDouble();
                System.out.print("Enter Number of Hours Worked: ");
                numHours = input.nextDouble();
                } 
                catch (NoSuchElementException nse) 
                {
                        System.err.println("Wrong element type...");
                }
        }
        
        /**
         * void method, doesn't accept or return anything
         * used to print the information stored for any Contractor employees indexed in the employees array
         * inside the Employee class
         * This method also appends the salary to the end of the contractors employee information to match the style
         * output
         */
        @Override
        public void printInfo() 
        {
                super.printInfo();
                System.out.printf(" %10.2f|\n", hourlyRate * numHours);
        }
        /**
         * readFile method is used to input the values of the super class, from the superclass method call,
         * and input the hourlyRate and numHours of the Contractor() object
         * @param input is passed to the readFile method to allow for the file to be read.
         */
        @Override
        public void readFile(Scanner input) 
        {
                super.readFile(input);        
                hourlyRate = input.nextDouble();
                numHours = input.nextDouble();
        }
}