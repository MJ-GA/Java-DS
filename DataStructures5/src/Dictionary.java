import java.io.File;
		import java.io.FileNotFoundException;
		import java.util.Map;
		import java.util.Scanner;
		import java.util.TreeMap;
		/**
		 * Dictionary class will contain all data manipulation methods.
		 * @author Mohamed Jouini
		 *
		 */
public class Dictionary {
/**
 * boolean variable to keep track of the state of option 6 
 */
    public static boolean defArticles = false;
    
/**
 * represents the number of occurances of A in the text
 *  */     
    private int numberOfAs = 0;
  /**
 * represents the number of occurances of An in the text
 *  */   
    private int numberOfAns = 0;
  /**
 * represents the number of occurances of The in the text
 *  */   
    private int numberOfThe = 0;
    
    /**
     * private TreeMap member
     */
    private TreeMap<String, Integer> dictionary = new TreeMap<>();

    /**
     * Static declaration of file Path
     */
    
    static private String PATH = "C:\\Users\\16138\\eclipse-workspace\\DataStructures5\\src\\";
    /**
     * New file object
     */
    File myFile = new File(PATH +"Raven.txt"); 
     /**
      * Constructor
      */
    public Dictionary() {}
/**
 * This method will add words from file to the dictionary
 * 
 */
    public void addWords () {
        try {
            // Scanner to read from file
            Scanner input = new Scanner(myFile);
            //While there is still data in the file
        	while (input.hasNextLine()) {
                //lowercase to avoid confusion
                String data = input.nextLine().toLowerCase();
                //regex
                String[] words = data.split("([\\W\\s]+)");
                //go through the file and save every word to the dictionary
                for (String word : words) {
                	//if it contains the word then count it
                if (dictionary.containsKey(word.toLowerCase())) {
                dictionary.put(word, dictionary.get(word)
                + 1);
                } else {
                dictionary.put(word, 1);
                }
                }
                }
                input.close();
                //save number of articles to later use
                numberOfAs = dictionary.get("a");
                numberOfAns = dictionary.get("an");
                numberOfThe = dictionary.get("the");
                System.out.println("Program has read the file");
            }catch (FileNotFoundException e) {
                System.out.println("An error occurred.");}
       } 
/**
 * This method will search for a particular word inside the dictionary
 * @param sc Scanner object 
 */
       public void searchWords(Scanner sc){
        System.out.print("Enter a word to search : ");
        //Lowercase to avoid word confusion
		String word = sc.next().toLowerCase();
        //use contains to search for the word in the treeMap and print message accordingly
		if (dictionary.containsKey(word)) {
		System.out.println(word + " is FOUND in the dictionary"
		+ " and it appears " + dictionary.get(word)
		+ " times.");
		} else {
		System.out.println(word + " occurs 0 times");
		}
       }

/**
 * This method will display the number of the unique words in the dictionary
 */
       public void getUnique(){
        System.out.println("Total unique words in the dictionary "
		+ "are : " + dictionary.size());
       }
/**
 * This method will show all the words inside the dictionary 
 */
       public void allWords(){
        int sum = 0;
        
		for (Map.Entry<String, Integer> entry :
		dictionary.entrySet()) {
		sum += entry.getValue();
       }
		  System.out.println("Total number of words in the dictionary"
					+ " are : " + sum);}

                    /**
                     * This method will empty the dictionary 
                     */
       public void reset (){
        dictionary.clear();
		System.out.println("Program has removed all the words");
       }
       /**
        * This method will enable/disable articles , by removing/adding them when needed.
        */
       public void activateDefinate(){
        if (!defArticles) {
            defArticles = true;
            dictionary.remove("a");
            dictionary.remove("an");
            dictionary.remove("the");
            } else {
            defArticles = false;
            dictionary.put("a", numberOfAs);
            dictionary.put("an", numberOfAns);
            dictionary.put("the", numberOfThe);
            }

       }
      
}

