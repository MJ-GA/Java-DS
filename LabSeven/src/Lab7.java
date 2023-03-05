
import java.util.InputMismatchException;
import java.util.Scanner ;
/**
 * Class which contains our main method
 * @author Mohamed Jouini
 *
 */
public class Lab7 {
	/**
	 * Creates Scanner Object , and implements necessary steps to make the program run without interruption using exception handling
	 * @param args main method argument
	 * 
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the name of the store");
		String name=input.nextLine();
		System.out.println("How many employees do you have ? : ");
		int num=0;
		int choice =0;
		boolean success = false ;
		while(!success || num <= 0) {
			try {
				num=input.nextInt();
				if(num < 0) {
					System.out.println("Number of employees Cannot be negative \n ");
				System.out.println("How many employees do you have ? : ");}
				else if(num == 0) {
					System.out.println("Number of employees Cannot be zero \n ");
				System.out.println("How many employees do you have ? : ");}
				success=true;
			} catch (InputMismatchException exception) {
				input.next();
				System.out.println("****Input Mismatch Exception while reading number of employees***** !");
			}
			}
		Store store = new Store(num) ;
		int i=0 ;
		while (choice !=3) {
			
			try {
				System.out.println("1.Read Employee Details\n2.Print Employee Details\n3.Quit");
				System.out.print("Enter your option : ");
				choice=input.nextInt();
				
				if(choice > 3 ||choice < 1) {
					System.out.println("Invalid Option ...Please try again !");
					}
				try {
				switch(choice) {
				case 1 :
					i=i+1;
					store.readDetails(input,i);
					break;
				case 2 : 
					store.printTitle(name);
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n","Emp#","|","Name","|","Email","|","Phone","|","Salary","|");
					store.printDetails(i);
					break;
				case 3 : System.out.println("Goodbye... Have a nice day!");
				break;
				}
				} catch (InputMismatchException exception) {
					i=i-1;
					input.next();
					System.out.println("****Input Mismatch Exception while reading number of employees***** !");
				} catch (NullPointerException e) {
					System.out.println("Null Pointer");
				}
			} catch (InputMismatchException exception) {
				input.next();
				System.out.println("*****Input Mismatch Exception while reading selection of process***** !");
			} 
			 }
		}
	}
		
		
	


