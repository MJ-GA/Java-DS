import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class represents the University 
 * @author Mohamed Jouini
 *
 */
public class University {
    //instance variables
    protected String name;
    protected ArrayList < Student > Students;
    Scanner scan = new Scanner(System.in);
    public University(String name, int num) {
        this.name = name;
        Students = new ArrayList < > (); //creating an empty array with a size of
    }
    static void printLine() {
        System.out.println("================================================================================");
    }
    public void printTitle() {
        System.out.println(name + " - List of Students");
        System.out.println("************************************");
        System.out.println("Program|  Student#|           Name|          Email|        Phone|       GPA|      Fees|   Credits|");
    }

    public void readStudentsDeatils() {
        System.out.println("Enter details of student :");
        System.out.println("====================");
        System.out.println("1.FullTime \n2.Parttime");
        System.out.print("Enter Student type: ");
        int choice = scan.nextInt();
        Student student;
        if (choice == 1) {
            student = new FullTimeStudent();
            student.readInfo(); //calling the read info method from the fulltime
            Students.add(student);
        } else if (choice == 2) {
            student = new PartTimeStudent();
            student.readInfo();
            Students.add(student);
        }
    }
    /*
     * Prints All student details in a presentable mannner
     */
    public void printStudentsDetails() {
        for (int i = 0; i < Students.size(); i++) {
            Students.get(i).printInfo(); //to print
        }
    }
    public void readFromFile() {
        try {
            File file = new File("C:\\Users\\16138\\Desktop\\students.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] details = line.split(" ");
                    String studentType = details[0].trim();
                    int studentNumber = Integer.valueOf(details[1].trim());
                    String firstName = details[2].trim();
                    String lastName = details[3].trim();
                    String email = details[4].trim();
                    long phoneNumber = Long.valueOf(details[5].trim());
                    String programName = details[6].trim();
                    double gpa = Double.valueOf(details[7].trim());
                    double fees;
                    if (studentType.equalsIgnoreCase("f")) {
                        FullTimeStudent student = new FullTimeStudent();
                        fees = Double.valueOf(details[8].trim());
                        student.setStudentNumber(studentNumber);
                        student.setFirstName(firstName);
                        student.setLastName(lastName);
                        student.setEmail(email);
                        student.setPhoneNumber(phoneNumber);
                        student.setProgramName(programName);
                        student.setGpa(gpa);
                        student.setTutionFees(fees);
                        Students.add(student);
                    } else {
                        PartTimeStudent student = new PartTimeStudent();
                        fees = Double.valueOf(details[8].trim());
                        student.setCourseFeesTotal(fees);
                        double credits = Double.valueOf(details[9].trim());
                        student.setCredits(credits);
                        student.setStudentNumber(studentNumber);
                        student.setFirstName(firstName);
                        student.setLastName(lastName);
                        student.setEmail(email);
                        student.setPhoneNumber(phoneNumber);
                        student.setProgramName(programName);
                        student.setGpa(gpa);
                        Students.add(student);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}