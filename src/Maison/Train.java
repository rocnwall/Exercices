package Maison;

class Train extends Vehicule {
	Train() {
		super(100);
	}
	
	void direBonjour() {
		super.direBonjour();
		System.out.println("Tchootchoo!");
	}
}