
public class jalapeno extends Dekorator{
Pizza pizza;

public jalapeno (Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis();
}

public String pobierzSklad() {
	return pizza.pobierzSklad() + ", jalapeno";
}
public double pobierzRoz() {
	return pizza.pobierzRoz();
}
public int pobierzOstrosc() {
	return pizza.pobierzOstrosc();
}


public double koszt() {
	
	return pizza.koszt() + 6;
}
}