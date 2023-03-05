import java.util.Scanner ;
/**
 * This class inherits from Person class , and will act as a parent for Regular and Contractor classes
 * @author Mohamed Jouini
 *
 */
public class Employee extends Person {
	protected int employeeNumber ;
public Employee() {}
/**
 * this is Employee parameterized constructor .
 * @param firtName first name
 * @param lastName last name
 * @param email email
 * @param phoneNumber phone number
 * @param employeeNumber employee number
 */
public Employee(String firtName, String lastName, String email, long phoneNumber,int employeeNumber) {
		super(firtName, lastName, email, phoneNumber);
		this.employeeNumber=employeeNumber ;
	}
	/**
	 *this method is overridden and will use the super class to read the employee info
	 */
	@Override
	public void readInfo(Scanner input) {
		System.out.print("Enter employee number : ");
		employeeNumber=input.nextInt();
		super.readInfo(input);
		
	}
	/**
	 *This inherited method will print the employee info
	 */
	/**
     * void method, doesn't accept or return anything
     * used to print the information stored 
     */
	@Override
	public void printInfo() {
		System.out.printf("%-20d %-20s %-20s %-20s %-20s %-20s %-20d %-20s",employeeNumber,"|",firstName+" "+lastName,"|",email,"|",phoneNumber,"|");
	}
}
