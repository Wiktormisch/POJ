public class PizzaTest{
	public static void main(String[] args) {
		Pizzeria zamowienie1 = new nowaPizza();	
		Pizza pizza1 = zamowienie1.zamowPizza("Pepperoni");
		pizza1 = new oliwki (pizza1);
		pizza1 = new kurczak (pizza1);
		System.out.println("\nKlient zamowil pizze " + pizza1.pobierzOpis() +" ("+ pizza1.pobierzSklad() + ") bedzie kosztowac: " + pizza1.koszt()+"\n");

		Pizzeria zamowienie2 = new nowaPizza();	
		Pizza pizza2 = zamowienie2.zamowPizza("Pepperoni");
		System.out.println("\nKlient zamowil pizze " + pizza2.pobierzOpis() +" ("+ pizza2.pobierzSklad() + ") bedzie kosztowac: " + pizza2.koszt()+"\n");
		
		Pizzeria zamowienie3 = new nowaPizza();	
		Pizza pizza3 = zamowienie3.zamowPizza("Wegetarianska");
		pizza3 = new oliwki (pizza3);
		pizza3 = new jalapeno (pizza3);
		System.out.println("\nKlient zamowil pizze " + pizza3.pobierzOpis() +" ("+ pizza3.pobierzSklad() + ") bedzie kosztowac: " + pizza3.koszt+"\n");

		
}
}