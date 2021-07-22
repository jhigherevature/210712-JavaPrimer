package examples;

public class Input {
	public Pet findPet(String name) {
		/*
		 * The following method only works because the pet
		 * manager reference variable in the Simulator class
		 * is static
		 */
		for (Pet p : Simulator.pm.getAllPets()) {
			if (p.name.equalsIgnoreCase(name)) {
				return p;
			}
		}
		
		/*
		 * If we look through all Pets and we do NOT find
		 * a pet with a matching name, we will return null
		 */
		return null;
	}
}
