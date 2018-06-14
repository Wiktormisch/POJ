public class Pepperoni extends nowaPizza {
public Pepperoni() {
	opis = "Pepperoni";
	ostrosc = 5;
	sklad = "salami, papryka, cebula, ser";
	roz = 2;

}
public double koszt() {
if(roz == 2) {
return 30.0;
}
else if(roz == 1) {
	return 25.0;
}
else {
	return 35.0;
}
}
}