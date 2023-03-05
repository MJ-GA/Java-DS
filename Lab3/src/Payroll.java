
public class Payroll extends Librarian {
	// Librarian array within a payroll object class
	Librarian [] librarians ;
	int length ;
	//Initiliaze array with user input
	public Payroll (int num) {
		for(int i=0;i<num;i++) {
	this.librarians = new Librarian[num];}
	}
	//Override inherited method 
	@Override 
	public void readLibrarian() {
				
		for(int i=0;i<librarians.length;i++){
			System.out.printf("\nEnter details of librarian %d \n",i+1);
			System.out.println("================================");
			super.readLibrarian();
			//Fill array with the correct type of librarian based on user input
			if(super.type==1)
				librarians[i] = new Fulltime(super.firstName,super.lastName,super.email,super.numberOfHours);
				else
					librarians[i] = new Parttime(super.firstName,super.lastName,super.email,super.numberOfHours);
				}
		}
//Prints each librarian's method of payment
	@Override
	public void printMethodOfPayment() {
		for(int i=0;i<this.librarians.length;i++) {
			librarians[i].printMethodOfPayment();
		}		
	}
	
	
	
	
	
	
	@Override
	public double payrollCalculation() {
		// TODO Auto-generated method stub
		return 0;
		}
	}