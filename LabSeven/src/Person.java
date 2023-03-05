import java.util.Scanner ;
/**
 * Employee class will be inheriting this class. So, think about the access specifiers for the instance variables.
 * @author Mohamed Jouini
 *
 */
public abstract class Person {
	protected String firstName ;
	protected String lastName ;
	protected String email ;
	protected long phoneNumber ;
	public Person () {}
	/**
	 * This is Person parameterized constructor
	 * @param firtName First name 
	 * @param lastName last name
	 * @param email email
	 * @param phoneNumber phone number
	 */
	public Person(String firtName,String lastName,String email,long phoneNumber) {
		this.firstName=firstName ;
		this.lastName=lastName ;
		this.email=email;
		this.phoneNumber=phoneNumber ;
	}
	
	/**
	 * This method will allow us to use the scanner object from our main method and use it to get user input .This method will inherited .
	 * @param input Our scanner object
	 */
	public void readInfo(Scanner input) {
		
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: " );
		lastName = input.next();
		System.out.print("Enter email: ");
		email = input.next();
		System.out.print("Enter phone number: ");
		phoneNumber=input.nextLong();
	}
	/**
	 * This abstract method will be inherited.
	 */
	public abstract void printInfo() ;

}
