//Klasa
class Flight{
	//other members elided for clarity
	private int flightNumber;
	private char flightClass;
	@Override
	public boolean equals(Object o){
		if(super.equals(o)){
			return true
		}
		if(!(o instanceof Flight)){
			return false;
		}
		Flight other = (Flight) o;
		return flightNumber == other.flightNumber && flightClass == other.flightClass;
	}
}

//Pozivanje izvan Klase
Flight f1 = new Flight(175);
Flight f2 = f1;
if(f1.equals(f2)){
	//do something
}