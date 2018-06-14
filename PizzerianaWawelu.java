
public class PizzerianaWawelu extends Pizzeria {

	Pizza zrobPizza(String item) {
		if(item.equals("Capricciosa")) 
		{
			return new Capricciosa();
		}
		else return null;	
	}
	public double koszt() {
		return 15;
	}
	
}
