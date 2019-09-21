package Maison;

import java.lang.*;

class Vehicule {
	int nombreRoues;
	
	Vehicule() {}
	
	Vehicule(int nombreRoues) {
		this.nombreRoues=nombreRoues;
	}
	
	void direBonjour() {
		System.out.println("Bonjour, je suis un " + this.getClass().getName() + " avec " + nombreRoues + " roues.");
	}
}
	