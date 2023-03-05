import java.util.Scanner;
/**
 * PartTimeStudent and FullTimeStudent will be inherting this class 
 * @author Mohamed Jouini
 *
 */
public class Student implements Person {
    //access modifiers - protected
    //instance variables
	
    protected int studentNumber;
    protected String programName;
    protected double gpa;
    protected String firstName = "";
    protected String lastName = "";
    protected String email = "";
    protected long phoneNumber = 0;
    Scanner scan = new Scanner(System.in); //scanner
    //constructor
    /**
     * this is Student default constructor .
     */
    public Student() { //default constructor
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setProgramName(String programName) {
        this.programName = programName;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    /**
     * readInfo is passed the input parameter from the main class to read user input. 
     */
    @Override
    public void readInfo() {

        System.out.print("Enter program name: ");
        this.programName = scan.next();
        System.out.print("Enter student number: ");
        this.studentNumber = scan.nextInt();
        System.out.print("Enter first name: ");
        this.firstName = scan.next();
        System.out.print("Enter last name: ");
        this.lastName = scan.next();
        System.out.print("Enter email Id: ");
        this.email = scan.next();
        System.out.print("Enter phone number: ");
        this.phoneNumber = scan.nextLong();
        readMarks();
    }
    public void readMarks() { //reading marks from the user
        //read marks -> double marks[]
        System.out.print("Enter number of courses: ");
        //
        int num = scan.nextInt(); // declaring the num (int) naming it
        double marks[] = new double[num];

        for (int i = 0; i < marks.length; i++) { // for loop will get the marks

            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scan.nextDouble();
        }
        calculateGPA(marks); //calculates gpa
    }
    public void calculateGPA(double marks[]) {
        double total = 0;
        for (int i = 0; i < marks.length; i++) { //for loop
            total = total + marks[i];
        }
        gpa = (total / marks.length) * 4 / 100; //calculations
    }

    /**
     * void method, doesn't accept or return anything
     * used to print the information stored 
     */
    public void printInfo() {
        // TODO Auto-generated method stub
        System.out.format("%7s|%10d|%15s|%15s|%13d|%10.2f|",
            programName, studentNumber, firstName + " " + lastName, email, phoneNumber,
            gpa);

    }
}