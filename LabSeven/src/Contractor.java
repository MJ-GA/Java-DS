import java.util.Scanner;

/**
 * This is the Contractor type class 
 * @author Mohamed Jouini
 *
 */
public class Contractor extends Employee {
	protected double hourlyRate;
	protected double numHours ;
	/**
	 * Empty Constructor
	 */
	public Contractor() {}
	/**
	 * Parameterized Contractor constructor
	 * @param firtName first name
	 * @param lastName last name
	 * @param email email
	 * @param phoneNumber phone number
	 * @param employeeNumber employee number
	 * @param hourlyRate hourly rate
	 * @param numHours number of hours worked 
	 */
	public Contractor(String firtName, String lastName,String email, long phoneNumber, int employeeNumber,double hourlyRate ,double numHours) {
		super(firtName, lastName, email, phoneNumber, employeeNumber);
		this.hourlyRate=hourlyRate;
		this.numHours=numHours ;
	}
	/**
	 * this method is overridden , it will helps us read user info 
	 *@param input Scanner object 
	 */
	@Override
	public void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.print("Enter hourly rate: ");
		this.hourlyRate=input.nextDouble();
		System.out.print("Enter number of hours: ");
		this.numHours=input.nextDouble();
	}
	/**
	 *This method is overridden is will helps us format the printed text 
	 */
	@Override 
	public void printInfo() {
		super.printInfo();
		System.out.printf(" %-20.2f %-20s%n",hourlyRate*numHours,"|");
	}



}
