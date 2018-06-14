
public class kurczak extends Dekorator{
Pizza pizza;

public kurczak (Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis();
}
public String pobierzSklad() {
	return pizza.pobierzSklad() + ", kurczak";
}
public double pobierzRoz() {
	return pizza.pobierzRoz();
}
public int pobierzOstrosc() {
	return pizza.pobierzOstrosc();
}


public double koszt() {
	
	return pizza.koszt() + 5;
}
}