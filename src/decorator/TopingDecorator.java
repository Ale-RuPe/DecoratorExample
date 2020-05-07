package decorator;

public abstract class TopingDecorator implements Pizza{
	private Pizza pizza;
	
	public TopingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return this.pizza.getDescription();
	}
	
	public int getCost() {
		return this.pizza.getCost();
	}
}
