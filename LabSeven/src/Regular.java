import java.util.Scanner ;
/**
 * This class is represents the Employee type " Regular "
 * @author Mohamed Jouini
 *
 */
public class Regular extends Employee{
	
	protected double salary ;
	public Regular () {}
	/**
	 * this is the Regular parameterized constructor .
	 * @param firtName first name
	 * @param lastName last name 
	 * @param email email
	 * @param phoneNumber phone number
	 * @param employeeNumber employee number
	 * @param salary salary of the employee 
	 */
	public Regular(String firtName, String lastName, String email, long phoneNumber, int employeeNumber,double salary) {
		super(firtName, lastName, email, phoneNumber, employeeNumber);
		this.salary=salary ;
	}
	/**
	 *This method is overridden ,it inherits from superclass method readInfo and adds the attributes of this class 
	 *@param input Scanner object 
	 */
	@Override
	public void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.print("Enter annual income : ");
		this.salary=input.nextDouble()/12;
	}
	/**
	 *This method is overridden ,it inherits from superclass method printInfo and adds the attributes of this class 
	 */
	@Override 
	public void printInfo() {
		super.printInfo();
		System.out.printf(" %-20.2f %-20s%n",salary,"|");
	}
}
