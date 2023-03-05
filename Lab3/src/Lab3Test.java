import java.util.Scanner ;
public class Lab3Test {

	public static void main(String[] args) {
	
	

            //creating an instance for Scanner class

            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of librarians:  ");

            int num = input.nextInt();

            //creating payroll object for Payroll class with num parameter

            Payroll payroll = new Payroll(num);

            //invoking readLibrarians method

            payroll.readLibrarian();

            System.out.println("\n\nSummary of Payroll Processing");

            System.out.println("================================");

       

            payroll.printMethodOfPayment();

         
	
	    
	   	    
	   
	}
	}
