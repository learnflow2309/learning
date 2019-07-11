//Klasa
public class Flight{
	// other members elided for clarity
	public void add1Passenger(Passenger p){...}
}

//Produženje klase
public class CargoFlight extends Flight{
	float maxCargoSpace = 1000.0f;
	float usedCargoSpace;

	public void add1Package(float h, float w, float d){
		double size = h * w * d;
		if(hasCargoSpace(size)){
			usedCargoSpace += size;
		}else{
			handleNoSpace();
		}
	}

	private boolean hasCargoSpace(float size){
		return usedCargoSpace + size <= maxCargoSpace;
	}

	private void handleNoSpace(){
		System.out.println("Not enough space");
	}
}

//Pozivanje izvan klase
CargoFlight cf = new CargoFlight();
cf.add1Package(1.0, 2.5, 3.0);
Passenger jane = new Passenger (0, 2);
cf.add1Passenger(jane);

//Pozivanje izvan klase 2
Flight f = new CargoFlight();
Passenger jane = new Passenger(0, 2);
f.add1Passenger(jane);
f.add1Package(1.0, 2.5, 1.5); //Ne prolazi zato so Osnovna klasa ne može koristiti reference Izvedene klase

//Pozivanje izvan klase 3
Flight[] squardon = new Flight[5];
squardon[0] = new Flight();
squardon[1] = new CargoFlight();
squardon[2] = new CargoFlight();
squardon[3] = new Flight();
squardon[4] = new CargoFlight();