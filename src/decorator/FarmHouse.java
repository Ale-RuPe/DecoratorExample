package decorator;

public class FarmHouse extends PizzaA{
	public FarmHouse(){
		super("Pizza","FarmHouse");
	}
	
	@Override
	public int getCost() {
		return 300;
	}
}
