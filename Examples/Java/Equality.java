//Default Objekt klasa
...

//Pozivanje izvan klase
Flight f1 = new Flight(175);
Flight f2 = new Flight(175);
if(f1 == f2){ //false - izvršava reference equals test (U ovom slučaju da li f1 i f2 pointaju na isti Objekt)
	//do something
}
if(f1.equals(f2)){ //false - izvršava reference equals test (U ovom slučaju da li f1 i f2 pointaju na isti Objekt)
	//do something
}

//Klasa sa Override-anom equals metodom Objekt klase
class Flight{
	//other members elided for clarity
	private int flightNumber;
	private char flightClass;

	//Override default Object class metode
	@Override
	public boolean equals(Object o){
		Flight other = (Flight)o; //Castanje u FLight
		return flightNumber == other.flightNumber && flightClass == other.flightClass; //Definiranje što jednako znači
	}
}

//Pozivanje izvan klase
Flight f1 = new Flight(175);
Flight f2 = new Flight(175);
if(f1 == f2){ //false - izvršava reference equals test (U ovom slučaju da li f1 i f2 pointaju na isti Objekt)
	//do something
}
if(f1.equals(f2)){ //true - izvršava override-anu equals metodu
	//do something
}
if(f1.equals(p)){ //treba paziti da ne uspoređujemo stvari koje nisu definirane u override-anoj metodi
	//do something
}

//Klasa 2 sa Override-anom equals metodom Objekt klase
class Flight{
	//other members elided for clarity
	private int flightNumber;
	private char flightClass;

	//Override default Object class metode
	@Override
	public boolean equals(Object o){
		if(!(o instanceof Flight)){
			return false;
		}

		Flight other = (Flight)o; //Castanje u FLight
		return flightNumber == other.flightNumber && flightClass == other.flightClass; //Definiranje što jednako znači
	}
}

//Pozivanje izvan klase
Flight f1 = new Flight(175);
Flight f2 = new Flight(175);
if(f1 == f2){ //false - izvršava reference equals test (U ovom slučaju da li f1 i f2 pointaju na isti Objekt)
	//do something
}
if(f1.equals(f2)){ //true - izvršava override-anu equals metodu
	//do something
}
if(f1.equals(p)){ //false - dodan je uvjet za slučaj