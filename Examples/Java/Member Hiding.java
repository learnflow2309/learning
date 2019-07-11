//Klasa
public class Flight {
	// other members elided for clarity
	int seats = 150;

	public void add1Passenger(){
		if(hasSeating()){
			passengers += 1;
		}else{
			handleTooMany();
		}
	}

	private boolean hasSeating(){
		return passengers < seats;	
	}

}

//Produženje klase
public class CargoFlight extends Flight {
	// other members elided for clarity
	int seats = 12;
}


//Pozivanje izvan klase
Flight f1 = new Flight();
System.out.println(f1.seats); //150

CargoFlight cf = new CargoFlight();
System.out.println(cf.seats); //12

Flight f2 = new CargoFlight();
System.out.println(f2.seats); //150

f2.add1Passenger(); //Koristi 150
cf.add1Passenger(); //Koristi 150