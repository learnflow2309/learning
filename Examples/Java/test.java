//Klasa
public class Flight {
	private int passengers;
	private int seats;

	public Flight(){
		seats = 150;
		passengers = 0;
	}

	public void add1Passenger(){
		if(passengers > seats)
			passengers += 1;
		else
			handleTooMany();
	}

	private void handleTooMany(){
		System.out.println("Too many");
	}
}

//Pozivanje izvan Klase
Flight flight1 = new Flight(); //Uspješno će stvoriti instancu klase
System.out.println(flight1.passengers); //Neće moći izvršiti naredbu
flight1.add1Passenger(); //Uspješno će se pozvati metoda klase, čak i u slučaju ako ima jednako ili više putnika
flight1.handleTooMany(); //Neće moći izvršiti naredbu

//Klasa
public class Flight {
	private int passengers;
	private int seats;
	// constructor and other methods elided for clarity

	public boolean hasRoom(Flight f2) {
		int total = passengers + f2.passengers;
		//if (total <= seats)
		//	return true;
		//else
		//	return false;
		return total <= seats;
	}

	public Flight createNewWithBoth (Flight f2) {
		Flight newFlight = new Flight();
		newFlight.seats = seats;
		newFlight.passengers = passengers + f2.passengers;
		return newFlight;
	}
}

//Pozivanje izvan Klase
Flight lax1 = new Flight();
Flight lax2 = new Flight();
// add passengers to both flights
Flight lax3;
if (lax1.hasRoom(lax2))
	lax3 = lax1.createNewWithBoth(lax2);

//Klasa
public class Flight {
	private int passengers;
	private int seats;
	// constructor and other methods elided for clarity

	// public boolean hasRoom(Flight f2) {
	// 	int total = passengers + f2.passengers;
	// 	return total <= seats;
	// }

	public boolean hasRoom(Flight f2) {
		int total = this.passengers + f2.passengers;
		return total <= seats;
	}
}

//Pozivanje izvan Klase
Flight lax1 = new Flight();
Flight lax2 = new Flight();
// add passengers to both flights
Flight lax3 = null;
if (lax1.hasRoom(lax2))
	lax3 = lax1.createNewWithBoth(lax2);
// do some other work
if (lax3 != null)
		System.out.println("Flights combined");