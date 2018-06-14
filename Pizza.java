public abstract class Pizza  {
	
String opis = "Pizza domyslna";
int ostrosc = 1;
String sklad = "ser";
double roz = 1.0;
int cena = 2;
double koszt = 1;

public String pobierzOpis() {
	return opis;
}


public String pobierzSklad(){
	return sklad;
}

public double pobierzKoszt() {
	return koszt;
}

public double pobierzRoz() {
	return roz;
}

public int pobierzOstrosc() {
return ostrosc;
}

public abstract double koszt();


void robieniePizzy() {
	System.out.println("Pizza " +opis+ " jest robiona ");
}

void pieczenie(){
	System.out.println("Pizza jest pieczona");
}

void odbior() {
	System.out.println("Pizza jest gotowa! Prosze o odbior");
}
}