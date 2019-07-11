//Klase
public class Flight /*extends Object - proširuje Object klasu bez da se mora pisati "extends Object"*/{...}

public class CargoFlight extends Flight{...}

public class Passenger /*extends Object*/{...}

//Korištenje izvan Klase
Object[] stuff = new Object[3];
stuff[0] = new Flight();
stuff[1] = new Passenger(0, 2);
stuff[2] = new CargoFlight();


//Korištenje izvan Klase
Object o = new Passenger();
o = new Flight[5];
o = new CargoFlight();
o.add1Package(1.0, 2.5, 3.0); //Ne prolazi pošto referenca ne zna ništa o CargoFlight metodama

if(o instanceof CargoFlight){ //Provjerava da li postoji instanca na CargoFlight 
	CargoFlight cf = (CargoFlight) o; //Stvara istu referencu na CargoFlight kao što ima "o" http://prntscr.com/k1k3el
	cf.add1Package(1.0, 2.5, 3.0);
}