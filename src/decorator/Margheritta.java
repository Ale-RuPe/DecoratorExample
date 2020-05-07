package decorator;

public class Margheritta extends PizzaA {

	public Margheritta(){
		super("Pizza","Margheritta");
	}
	
	@Override
	public int getCost() {
		return 100;
	}
}
