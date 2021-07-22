package examples;

public class Simulator {
	static PetManager pm = new PetManager();
	public static void main(String[] args) {
		Owner o = new Owner();
		pm.init();
		
		o.pets = pm.getAllPets();
		System.out.println(o.pets[1].collar.color);
	}
}
