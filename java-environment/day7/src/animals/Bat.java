package animals;

import utilities.Flyable;
import utilities.Fruit;
import utilities.Herbivorous;
import utilities.Vegetable;

public class Bat implements Flyable, Herbivorous {
	public void fly() {
		System.out.println("Flying at night");
	}

	@Override
	public void eat(Fruit f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digest(Fruit f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat(Vegetable v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void digest(Vegetable v) {
		// TODO Auto-generated method stub
		
	}
}
