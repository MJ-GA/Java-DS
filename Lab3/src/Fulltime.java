import java.util.Scanner;
public class Fulltime extends Librarian {
	//Protected not private in case we need these variables by a subclass 
	protected double hourlyRate =30 ;
	protected double deductionRate = 0.15 ;
	//New scanner instance
	Scanner input = new Scanner(System.in);
	//Read all librarian details 
	//Parameterized  constructor 
	public Fulltime (String firstName ,String lastName , String email , int numberOfHours ) {
		super.firstName=firstName ;
		super.lastName=lastName ;
		super.email=email ;
		super.numberOfHours=numberOfHours ;
			}
	
	//Inherited method from librarian class 
	@Override
	public void readLibrarian() {
	super.readLibrarian();}
	//Inherit abstract method from librarian and modify it
	@Override
	public double payrollCalculation() {
		
		return numberOfHours * this.hourlyRate * (1 - deductionRate) +  (5 *1/5*this.numberOfHours);
	}
	//Inherit abstract method from librarian and modify it
	@Override
	public void printMethodOfPayment() {
      System.out.println("Direct deposit of " + this.payrollCalculation() + " to " + this.firstName +" "+this.lastName + "'s bank account");
	
	}
	
	

}
