package decorator;

public class PeppyPaneer extends PizzaA{
	public PeppyPaneer(){
		super("Pizza","FarmHouse");
	}
	
	@Override
	public int getCost() {
		return 300;
	}
}
