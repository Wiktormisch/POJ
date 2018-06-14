
public class oliwki extends Dekorator{
Pizza pizza;

public oliwki(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() ;
}

public String pobierzSklad() {
	return pizza.pobierzSklad() + ", oliwki";
}
public double pobierzRoz() {
	return pizza.pobierzRoz();
}
public int pobierzOstrosc() {
	return pizza.pobierzOstrosc();
}


 public double koszt() {
	
	return pizza.koszt() + 2;
}
}