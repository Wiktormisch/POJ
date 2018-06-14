public class Capricciosa extends nowaPizza {
public Capricciosa() {
	opis = "Capricciosa";
	ostrosc = 1;
	sklad = "szynka, sos, ser";
	 
}
public double koszt() {
if(roz == 2) {
return 27.0;
}
else if(roz == 1) {
	return 22.0;
}
else {
	return 32.0;
}
}
}