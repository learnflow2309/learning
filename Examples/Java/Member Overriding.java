//Klasa
public class Flight {
	// other members elided for clarity
	int getSeats(){return 150;}

	public void add1Passenger(){
		if(hasSeating()){
			passengers += 1;
		}else{
			handleTooMany();
		}
	}

	private boolean hasSeating(){
		return passengers < getSeats();	
	}

}

//Produženje klase
public class CargoFlight extends Flight {
	// other members elided for clarity
	@Override //Prisiljava compiler da provjeri postoji li metoda Osnovne klase sa istim potpisom kao što ima Izvedena klasa
	int getSeats(){return 12;}
}

//Pozivanje izvan klase
Flight f1 = new Flight();
System.out.println(f1.getSeats()); //150

CargoFlight cf = new CargoFlight();
System.out.println(cf.getSeats()); //12

Flight f2 = new CargoFlight();
System.out.println(f2.getSeats()); //12

f2.add1Passenger(); //Koristi 12
cf.add1Passenger(); //Koristi 12