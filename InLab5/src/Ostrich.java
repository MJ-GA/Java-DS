
public class Ostrich extends Pet {
	int numberOfEgs ;
	//Inherited Constructor + added attribute
	public Ostrich(String bodyCovering, int numberOfLegs, double tax, double price, double profit,int numberOfEggs) {
		super(bodyCovering, numberOfLegs, tax, price, profit);
	    this.numberOfEgs=numberOfEggs ;
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
