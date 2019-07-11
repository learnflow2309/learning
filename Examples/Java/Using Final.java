//Klasa
public final class Passenger{ //Zavrsna klasa (Final class), ne može se dalje izmjeniti
	//...
}

final public class Passenger{ //public i final mogu zamjeniti mjesta
	//...
}

//Produženje klase
public class CargoFlight extends Flight{
	//other members elided for clarity

	public final void add1Package(float h, float w, float d){ //Zavrsna metoda (Final method), ne može se dalje izmjeniti (Override-ati)
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