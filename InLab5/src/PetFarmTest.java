import java.util.Scanner ;
public class PetFarmTest {

	//I didnt have to Complete this Lab .
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("many pets are there in your PetFarm: ");
		 
		int size = input.nextInt();
		 
		 PetFarm petFarm= new PetFarm(size);
		 
		 petFarm.readPets();
		
	}

}
