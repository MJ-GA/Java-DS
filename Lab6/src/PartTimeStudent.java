import java.util.Scanner;
public class PartTimeStudent extends Student {
    //instance variables
    protected double courseFeesTotal;
    protected double credits;
    Scanner scan = new Scanner(System.in);
    /**
     * readInfo is passed the input parameter from the main class to read user input. 
     */
    @Override
    public void readInfo() {
        super.readInfo(); //calls info from the parent class
        System.out.print("Enter total course fees: ");
        this.courseFeesTotal = scan.nextDouble();
        System.out.print("Enter credit hours: "); //reads tution fees from the
        this.credits = scan.nextDouble();
    }
    public void setCourseFeesTotal(double courseFeesTotal) {
        this.courseFeesTotal = courseFeesTotal;
    }
    public void setCredits(double credits) {
        this.credits = credits;
    }
    /**
     * void method, doesn't accept or return anything
     * used to print the information stored 
     */
    @Override
    public void printInfo() {
        super.printInfo(); //calls
        System.out.format("%10.2f|%10.2f|\n", courseFeesTotal, credits);
    }
}