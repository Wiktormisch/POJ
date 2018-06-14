
public class nowaPizza extends Pizzeria {

	Pizza zrobPizza(String item) {
		if(item.equals("Pepperoni")) {
			return new Pepperoni();
		}
		else if (item.equals("Capricciosa")) {
			return (Pizza) new Capricciosa();
		}
		else if (item.equals("Wegetarianska")) {
			return (Pizza) new Wegetarianska();
		}
		else return null;
	}
	public double koszt() {
	
		
		return 10;
	}
	
}
