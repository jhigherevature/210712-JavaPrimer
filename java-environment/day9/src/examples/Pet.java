package examples;

public class Pet {
	public String name;
	public Collar collar;
	public Pet petsPet;
	
	public Pet (String name, String color) {
		this.name = name;
		collar = new Collar();
		collar.color = color;
	}
}
