package examples;

public class PetManager {
	public Pet[] pets;
	public void init() {
		pets = new Pet[3];
		Pet scoob = new Pet("Scooby", "Green");
		Pet bacon = new Pet("Bacon", "Red");
		Pet fido = new Pet("Fido", "Blue");
		pets[0] = scoob;
		pets[1] = bacon;
		pets[2] = fido;
		
		scoob.petsPet = bacon;
		bacon.petsPet = scoob;
	}
	
	public Pet[] getAllPets() {
		return pets;
	}
}
