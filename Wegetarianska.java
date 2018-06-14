public class Wegetarianska extends nowaPizza {
public Wegetarianska() {
	opis = "Wegetarianska";
	ostrosc = 1;
	sklad = "papryka, pomidor, ser";
	roz = 2;
}
public double koszt() {
if(roz == 2) {
return 15.0;
}
else if(roz == 1) {
	return 22.0;
}
else {
	return 30.0;
}
}
} 