package decorator;

public class Barbeque extends TopingDecorator{
	
	public Barbeque(Pizza pizza) {
		super(pizza);
	}
	
	public int getCost() {
		return super.getCost() + 5;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Barbeque ";
	}
}
