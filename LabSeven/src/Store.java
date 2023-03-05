import java.util.Scanner ;
/**
 * This is the Store class 
 * @author Mohamed Jouini
 *
 */
public class Store {
	private Employee [] employees ;
	/**
	 * This is the Store parameterized constructor 
	 * @param size this represents the length of our array of employees 
	 */
	public Store (int size) {
		employees = new Employee[size];
	}
	/**
	 * This method will help us create an array of employee , employee type , and create new employee objects
	 * @param input
	 */
	public void readDetails(Scanner input,int i) {
		  int type =0 ;
			System.out.printf("Enter details of employee %d ",i);
			System.out.println("\n1.Regular \n2.Contructor");
			System.out.print("Enter employee type : ");
			type =input.nextInt();
			
			 if (type !=1 && type !=2) {
			do {
				System.out.println("Wrong input , Please enter a valid option");
				System.out.println("Enter employee type \n1.Regular \n2.Contructor");
				 type =input.nextInt();
			    } while(type !=1 && type !=2);}
			if (type==1) {
				this.employees[i-1]= new Regular();
				this.employees[i-1].readInfo(input);
				} else {
				this.employees[i-1]=new Contractor();
		     	this.employees[i-1].readInfo(input);;}
			
	}
	/**
	 * This method will help us print the employee information on user request
	 */
	public void printDetails(int x) {
		//In a for loop, call printInfo() to print details of all employees.
		for(int i=0; i<x;i++) {
			this.employees[i].printInfo();
	    }
	}
	/**
	 * this method will helps us print the name of the Store
	 * @param name the name of the store ! 
	 */
	public static void printTitle(String name) {
		System.out.println("=======================================================================================================================================================================================================\n"+name+"\n=======================================================================================================================================================================================================");
	}
}

