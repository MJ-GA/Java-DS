
public class Cat extends Pet {
	int numberOfKittens ;
	
	//Inherited Constructor + added attribute
	public Cat(String bodyCovering, int numberOfLegs, double tax, double price, double profit,int numberOfKittens) {
		super(bodyCovering, numberOfLegs, tax, price, profit);
		this.numberOfKittens=numberOfKittens ;
		
	}
	//inherited abstract method
	@Override
	public void printDetails() {
			
	}
	@Override
	public double calculateProfit() {
		
		return 0;
	}

}
