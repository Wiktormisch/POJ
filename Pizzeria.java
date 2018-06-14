public abstract class Pizzeria extends Pizza {
	public Pizza zamowPizza(String type) {
		Pizza pizza;
		pizza = zrobPizza(type);
		pizza.robieniePizzy();
		pizza.pieczenie();
		pizza.odbior();
		
		return pizza;
	}
	abstract Pizza zrobPizza(String type);
}

	
