import java.util.Scanner;
//Librarian inherits from worker
public abstract class Librarian {
	protected String firstName ;
	protected String lastName ;
	protected String email;
	protected int numberOfHours ; 
	protected int type;
	//New scanner instance
	Scanner input = new Scanner(System.in);
	//Constructor with inherited attributes
	public Librarian(String firstName, String lastName, String email,int numberOfHours) {
		this.firstName =firstName;
		this.lastName=lastName;
		this.email=email;
		this.numberOfHours=numberOfHours ;
	}
	public Librarian() {}
    
	public void readLibrarian() {
		
		//Read all librarian details 
		System.out.print("Enter Librarian first name ");
		firstName=input.nextLine();
		
		System.out.print("Enter Librarian last name ");
		lastName=input.nextLine();
		System.out.print("Enter Librarian email ");
		email=input.nextLine();
		System.out.print("Enter Number Of hours worked ");
		numberOfHours=input.nextInt();
		System.out.print("Enter the type of librarian \n1.Fulltime \n2.Parttime \nEnter Type : ");
		type=input.nextInt();
		input.nextLine();
		}
	 //Method for getting Worker Name and Last Name
	public String getName() {
		return firstName + " " + lastName;
	}
	public abstract double payrollCalculation(); // this is an abstract method that will be used to calculate payroll
	public abstract void printMethodOfPayment();// this is an abstract method that will be used to print method of payment
}
    
	
