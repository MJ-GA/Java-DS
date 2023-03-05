import java.util.Scanner;
public class FullTimeStudent extends Student {
    protected double tutionFees;
    Scanner scan = new Scanner(System.in);
    /**
     * readInfo is passed the input parameter from the main class to read user input. 
     */
    @Override
    public void readInfo() {
        super.readInfo(); //calls info from the parent class
        System.out.print("Enter tution fees: ");
        this.tutionFees = scan.nextDouble();
    }
    public void setTutionFees(double tutionFees) {
        this.tutionFees = tutionFees;
    }
    /**
     * void method, doesn't accept or return anything
     * used to print the information stored 
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("%10.2f|\n", tutionFees); //prints the tution fees
    }
}