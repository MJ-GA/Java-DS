import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This our main class 
 * @author Mohamed Jouini
 *
 */
public class UniversitySystemTest {
    public static void main(String[] args) {
    	/**
         * This Scanner object will be passed throughout the program, used as the only source 
         * for scanning user input and reading files.
         */
        Scanner input = new Scanner(System.in); //scanning
        System.out.print("Enter the name of University: ");
        String name = input.nextLine();
        int n;
        while (true) {
            System.out.print("Enter number of students: ");
            /**
             * try-catch block used to observe for any exceptions 
             */
            try {
                n = new Scanner(System.in).nextInt();
                System.out.print("\n");
                break;
            } catch (Exception e) {
                System.out.println("\nInput Mismatch Exception");
            }
        }
        University c1 = new University(name, n); //create a new university
        String main_menu = "1.Register Students\n";
        main_menu += "2.Display Students\n";
        main_menu += "3.Exit\n";
        main_menu += "Enter your choice: ";
        /**
         * This loop is the menu for the program.
         * choice == 1 allows Register Students 
         * choice == 2 allows Display Students
         * choice == 3 exits
         */
        while (true) {
            try {
                System.out.print(main_menu);
                int selected_choice = new Scanner(System.in).nextInt();
                System.out.print("\n");
                /**
                 * This loop is the menu for the program.
                 * choice == 1 allows for opening/ reading the file
                 * choice == 2 allows for user input
                 * choice == 3 exits the program
                 */
                switch (selected_choice) {
                    case 1:
                        String register_menu = "1.Read from file\n";
                        register_menu += "2.Read from the user\n";
                        register_menu += "Enter your option: ";
                        System.out.print(register_menu);
                        int register_choice = new Scanner(System.in).nextInt();
                        if (register_choice == 1) {
                            // TODO read from file, update student list
                            c1.readFromFile();
                            break;
                        } else if (register_choice == 2) {
                            // Register student from user manual input
                            c1.readStudentsDeatils();

                            break;
                        }
                        break;
                    case 2:
                        if (c1.Students.isEmpty()) {
                            System.out.println("No students to display....");
                        } else {
                            c1.printTitle();
                            c1.printStudentsDetails();
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...Goodbye.... Have a nice day");
                        System.exit(0);
                    default:
                        System.err.println("Invalid Option");
                        break;
                }
                /** Try block used to catch invalid menu options */
            } catch (InputMismatchException e) {
                System.out.println("\nInput Mismatch Exception");
            }
        }

    }
}