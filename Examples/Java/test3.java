//Klasa
public class Flight {
    private int passengers;
    private int seats;
    public boolean hasRoom(Flight f2) {
            int total = this.passengers + f2.passengers;
            return total <= seats;
    }
}

public class Eearth{
	long circumferenceInMiles = 24901;
	//long circumferenceInKilometers = 24901 * 1.6d;
	//long circumferenceInKilometers = (long)(24901 * 1.6d);
	//long circumferenceInKilometers = (long)(circumferenceInMiles * 1.6d);
	long circumferenceInKilometers = Math.round(circumferenceInMiles * 1.6d);
}

//Klasa
public class Passenger{
	private int checkedBags;
	private int freeBags;
	// accessory & mutators elided for clarity

	private double perBagFee;

	//public Passenger(){
	//	//Javin default konstruktora ako nema definiranog konstruktora
	//}

}

//Pozivanje izvan Klase
Passenger bob = new Passenger();
bob.setCheckedBags(3);

//Klasa
public class Passenger{
	private int checkedBags;
	private int freeBags;
	// accessory & mutators elided for clarity

	private double perBagFee;

	//public Passenger(){
	//	//Javin default konstruktora ako nema definiranog konstruktora
	//}

	public Passenger(){

	}

	public Passenger(int freeBags) {
		this.freeBags = freeBags;
	}

}

//Pozivanje izvan Klase
Passenger bob = new Passenger(); //Više se ne može izvršiti pošto je definiran konstruktor koji zahtjeva broj
bob.setCheckedBags(3);

Passenger jane = new Passenger(2);
jane.setCheckedBags(3);

//Klasa
public class Passenger{
	// fields & methods elided for clarity

	public Passenger(){
		
	}

	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0d : 50.0d); //Poziva konstruktor za perBagFee pošto je samo jedan parametar i to double tipa
		this.freeBags = freeBags; //Postavlja int freeBags na prosljeđenu vrijednost
	}

	public Passenger(int freeBags, int checkedBags) {
		this(freeBags); //Poziva konstruktor za freeBags pošto je samo jedan parametar i to int tipa
		this.checkedBags = checkedBags; //Postavlja int freeBags i int checkedBags na prosljeđenu vrijednost
	}

	//Postavljanje cijene treba biti privatno da se ne bi promjenila cijena od strane korisnika
	//Da nije private netko bi mogao izvršiti npr. Passenger cheapJoe = new Passenger(0.01d);
	private Passenger(double perBagFee) {
		this.perBagFee = perBagFee; //Postavlja double perBagFee na prosljeđenu vrijednost no nije ju moguće postaviti izvan klase npr. Passenger cheapJoe = new Passenger(0.01d);
	}

}

//Pozivanje izvan Klase
Passenger jane = new Passenger(2);
jane.setCheckedBags(3);

Passenger jane = new Passenger(2, 3);
