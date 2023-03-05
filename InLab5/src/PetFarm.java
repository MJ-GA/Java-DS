import java.util.Scanner ;
public class PetFarm extends Pet {
//Array of pets 
	Pet [] pets ;
	String message ;
	//Initiliaze array with constructor
	public  PetFarm (int size) {
		for(int i=0;i<size;i++) {
			this.pets = new Pet[size] ;}
			}

	//Scanner input variable
	Scanner input = new Scanner(System.in);
	public void readPets() {
		//Populate array with objects of cat and ostrich
		for(int i=0;i<pets.length;i++){
		int option ;
			do {
			System.out.printf("\n Please pick an option \n");
			System.out.println("================================");
			option = input.nextInt();
			}
			while (option != 1 || option != 2) ;
			if(option==1) {
			 int numberOfKittens ;
			 numberOfKittens=input.nextInt();
				pets[i] = new Cat("fur",4,12,400,calculateProfit(),numberOfKittens);}
				else if(option==2) {
					int numberOfEggs = input.nextInt();
					pets[i] = new Ostrich("feathers",2,6,3.5,calculateProfit(),numberOfEggs);
				}
		
			
		}
		}
	//Incompleted print method
	@Override
	public void printDetails() {
		for(int i=0;i<pets.length;i++){
			if(pets[i].getClass().getSimpleName()=="Cat")
			System.out.printf("I’m a Cat with 4 legs, covered with fur and have %d kittens ");
			else{
				System.out.printf("I’m an Ostrich with 2 legs and very tall, covered with feathers and laid  eggs");
			}
		}
		
	}
	//Incomplete Process method
	public void process(Pet array[],int i) {
		
		if (array[i].getClass().getSimpleName()=="Cat") {
			this.message = "I’m a Cat with 4 legs, covered with fur and have %d kittens " ;
			
			
		} else {
			
		}
		
	}
	@Override
	public double calculateProfit() {
		return 0 ;
	}
	
	}
	
	

