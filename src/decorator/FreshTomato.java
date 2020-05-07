package decorator;

public class FreshTomato extends TopingDecorator {
	
	public FreshTomato(Pizza pizza) {
		super(pizza);
	}
	
	public int getCost() {
		return super.getCost() + 5;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Fresh Tomato ";
	}
}
