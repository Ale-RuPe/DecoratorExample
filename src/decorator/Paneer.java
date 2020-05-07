package decorator;

public class Paneer extends TopingDecorator{
	
	public Paneer(Pizza pizza) {
		super(pizza);
	}
	
	public int getCost() {
		return super.getCost() + 5;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Paneer ";
	}
}
