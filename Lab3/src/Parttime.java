import java.util.Scanner;
public class Parttime extends Librarian {
	//Protected not private in case we need these variables by a subclass 
	protected double hourlyRate =45 ;
	protected double taxRate = 0.15 ;
	//New scanner instance
	Scanner input =new Scanner(System.in);
	//Read all librarian details 
public Parttime (String firstName ,String lastName , String email , int numberOfHours ) {
	super.firstName=firstName ;
	super.lastName=lastName ;
	super.email=email ;
	super.numberOfHours=numberOfHours ;	
	}
//Inherited method from librarian that reads input related to user from user 
	@Override
	public void readLibrarian() {
		super.readLibrarian();
		System.out.print("Please enter librarian Hourly rate");
		hourlyRate =input.nextDouble();
		System.out.print("Please enter librarian number of hours worked");
		numberOfHours=input.nextInt();
		}
	//Inherit abstract method from librarian and modify it
	@Override
	public double payrollCalculation() {
		double x ;
		x= super.numberOfHours * this.hourlyRate * (1 - taxRate) +  (10 *1/4*super.numberOfHours);
		return x ;
	}
	@Override
	public void printMethodOfPayment() {
		  System.out.println("Mailed a cheque to "  + this.firstName + " "+this.lastName + " for " + this.payrollCalculation() );
		
	}

}