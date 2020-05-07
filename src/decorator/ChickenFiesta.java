package decorator;

public class ChickenFiesta extends PizzaA {
	public ChickenFiesta(){
		super("Pizza","FarmHouse");
	}
	
	@Override
	public int getCost() {
		return 300;
	}
}
