
import java.io.File;
		import java.io.FileNotFoundException;
		import java.util.Map;
		import java.util.Scanner;
		import java.util.TreeMap;
		/**
		 * Assign3Test will contain the main method and the menu.
		 * @author Mohamed Jouini
		 *
		 */
public class Assign3Test {

	/**
	 * Dictionary class instance
	 */
	static Dictionary myDictionary = new Dictionary();
	/**
	 * This method will display the menu on call
	 */
	public static void showMenu() {
		System.out.println("*********************************************\n"
				+ "DICTIONARY\n"
				+ "*********************************************\n"
				+ "1. Add words to the Dictionary from file\n"
				+ "2. Search a word in the Dictionary\n"
				+ "3. Display number of unique words in the Dictionary\n"
				+ "4. Display number of all words in the Dictionary\n"
				+ "5. Reset Dictionary\n"
				+ "6. Ignore definite and indefinite articles "
				+ "(" + myDictionary.defArticles + ") \n"
				+ "7. Exit");
				}
		
/**
 * Main method
 * @param args args
 */
	public static void main(String[] args) {
		//Scanner for user input
		Scanner sc = new Scanner(System.in);
		//boolean variable to keep track of the exit condition
		boolean menu = true;
	//Menu loop that will keep asking user to input options until menu = false
		while (menu) {
		showMenu();
		System.out.print("Enter your option: ");
		String choice = sc.next();

		switch (choice) {
		case "1": 
		// Add words to the Dictionary from file
		myDictionary.addWords();
		myDictionary.activateDefinate();
		myDictionary.activateDefinate();
		break;
		
		case "2": 
			//Search a word in the Dictionary
		myDictionary.searchWords(sc);
		break;
		
		case "3": 
			//Display number of unique words in the Dictionary
		myDictionary.getUnique();
		break;
		
		case "4": 
			//Display number of all words in the Dictionary
		myDictionary.allWords();
		
		break;
		
		case "5": 
			//Reset Dictionary
		myDictionary.reset();
		break;
		
		case "6": 
			//Ignore definite and indefinite articles (false) 
		myDictionary.activateDefinate();
		break;
		
		case "7":
			//Exit
		System.out.println("Good bye.... hope to see you soon");
		menu = false;
		break;
		  
		default:
			//Incorrect input
		System.out.println("Input Mismatch Exception while "
		+ "reading user's option from main menu");
			}
		}
	}
}
		
		
		

	


