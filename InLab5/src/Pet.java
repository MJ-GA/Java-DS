
public abstract class Pet {
	String myName = "MohamedJouini" ;
	String bodyCovering ;
	int numberOfLegs ;
	double tax ;
	double price ;
	double profit ;
	//Constructor 
	public Pet ( ) {}
	public Pet (String bodyCovering, int numberOfLegs , double tax , double price , double profit) {
		//Populating the attirubutes with user input 
		this.bodyCovering=bodyCovering ;
		this.numberOfLegs=numberOfLegs ;
		this.tax=tax;
		this.price =price;
		this.profit =profit;
	
	}
	//abstract methods 
	public abstract void printDetails();
	public abstract double calculateProfit();

}
